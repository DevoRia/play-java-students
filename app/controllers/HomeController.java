package controllers;

import models.Student;
import play.libs.Json;
import play.mvc.*;

import services.DataService;

import java.util.*;

import javax.inject.Inject;

public class HomeController extends Controller {

    @Inject
    DataService dataService;

    public Result index() {
        List content = dataService.findAll();
        return ok(Json.toJson(content));
    }

}
