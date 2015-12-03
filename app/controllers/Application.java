package controllers;

import models.Category;
import models.Word;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.categories;
import views.html.exercise;
import views.html.index;

import java.util.List;

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
        for(Category category : allCategories) {
          category.words=null;
        }

        return ok(Json.toJson(allCategories));
    }



    @Transactional
    public Result getWords()
    {
        List<Word> allWords = Word.getAll();
        for(Word word : allWords) {
            word.category.words=null;
            word.answers=null;
        }

        return ok(Json.toJson(allWords));
    }

}