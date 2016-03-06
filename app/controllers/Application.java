package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result Courses(){
        return ok(Courses.render("hi"));
//        return renderTemplate(Courses.scala.html);
    }

    public Result LogIn(){
        return ok(LogIn.render());
    }

}
