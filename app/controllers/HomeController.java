package controllers;

import models.Student;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;

import services.DataService;

import java.util.*;

import javax.inject.Inject;

public class HomeController extends Controller {

    @Inject
    private DataService dataService;

    @Inject
    private FormFactory formFactory;



    public Result index() {
        List content = dataService.findAll();
        return ok(Json.toJson(content));
    }

    public Result add() {
        String name = getDynamicForm().get("name");
        String group = getDynamicForm().get("group");
        dataService.save(new Student(name, Integer.parseInt(group)));
        return ok("Success");
    }

    public Result edit() {
        String name = getDynamicForm().get("name");
        String group = getDynamicForm().get("group");
        String id = getDynamicForm().get("id");
        dataService.edit(new Student(Integer.parseInt(id), name, Integer.parseInt(group)));
        return ok("Success");
    }

    public Result remove(String id) {
        dataService.remove(dataService.findById(Integer.parseInt(id)));
        return ok("Success");
    }

    private DynamicForm getDynamicForm() {
        return formFactory.form().bindFromRequest();
    }


}
