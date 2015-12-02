package controllers;

import models.Category;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.categories;
import views.html.exercise;
import views.html.index;
import play.db.jpa.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Transactional
      public Result getCategories()
    {
        List<Category> allCategories = Category.getAll();
        Set<String> categories = new HashSet<>();
        for(Category category : allCategories) {
            categories.add(category.name);
        }
        categories = categories.stream().collect(Collectors.toSet());
        return ok(Json.toJson(categories));
    }

    @Transactional
    public Result getWords()
    {
        List<Category> allCategories = Category.getAll();
        Set<String> categories = new HashSet<>();
        for(Category category : allCategories) {
            categories.add(category.name);
        }
        categories = categories.stream().collect(Collectors.toSet());
        return ok(Json.toJson(categories));
    }

}