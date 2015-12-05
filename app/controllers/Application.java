package controllers;

import models.Category;
import models.User;
import models.Word;
import play.data.*;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.categories;
import views.html.exercise;
import views.html.index;
import views.html.login;

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



    @Transactional
    public Result getCategories() {
        List<Category> allCategories = Category.getAll();
        for (Category category : allCategories) {
            category.words = null;
        }

        return ok(Json.toJson(allCategories));
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