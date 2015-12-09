package controllers;

import models.Category;
import models.User;
import models.Word;
import play.data.*;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.List;

import static play.data.Form.form;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result categories() {
        return ok(categories.render());
    }

    public Result exercise() {
        return ok(exercise.render());
    }

//    Login

    public Result login() {
        return ok(
                login.render(form(Login.class))
        );
    }

    @Transactional
    public Result authenticate() {
        System.out.println("Hello3");
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                    routes.Application.index()
            );
        }
    }

// Logout

    @Transactional
    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
                routes.Application.index()
        );
    }

//Register

    public Result register() {
        return ok(register.render());
    }

    @Transactional
    public Result getCategories() {
        List<Category> allCategories = Category.getAll();
        for (Category category : allCategories) {
            category.words = null;
        }

        return ok(Json.toJson(allCategories));
    }

    @Transactional
    public Result addUser() {

        User person = Form.form(User.class).bindFromRequest().get();

        //Check if User (email) already exist in the database
        if (User.find(person.email) == null) {
            person.save();

            //Login the user
            session().clear();
            session("email", person.email);
            session("id", Integer.toString(person.id));
            System.out.println("Person " + person.firstName + " " + person.secondName + " saved successfully");
        } else {
            System.out.println("Email address " + person.email + " already exists");
        }
        return redirect(
                routes.Application.index()
        );
    }

    @Transactional
    public Result getWords() {
        List<Word> allWords = Word.getAll();
        for (Word word : allWords) {
            word.category.words = null;
            word.answers = null;
        }

        return ok(Json.toJson(allWords));
    }

    public static class Login {

        public String email;
        public String password;

        public String validate() {
            if (User.authenticate(email, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }

    }

}