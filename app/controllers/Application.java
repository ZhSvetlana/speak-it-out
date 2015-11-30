package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.categories;
import views.html.exercise;
import views.html.index;

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
}