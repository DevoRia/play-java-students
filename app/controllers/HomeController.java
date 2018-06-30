package controllers;

import play.mvc.*;

import repositories.StudentRepo;
import views.html.*;

import javax.inject.Inject;

public class HomeController extends Controller {

    @Inject
    StudentRepo repo;

    public Result index() {
        return ok(repo.findAll().toString());
    }

}
