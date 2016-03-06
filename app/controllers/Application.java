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
    }

    public Result LogIn(){
        return ok(LogIn.render(""));
    }

    public Result ChangePass(){
        return ok(ChangePass.render(""));
    }

    public Result ForgetPass(){
        return ok(ForgetPass.render(""));
    }

    public Result MessageThread(){
        return ok(MessageThread.render(""));
    }

    public Result Inbox(){
        return ok(Inbox.render(""));
    }

    public Result Upload(Long id){
        return ok(UploadBox.render(""));
    }

//    public Result CourseIndex(Long id){
//        return ok(CourseIndex.courseIndex.render(""));
//    }

}
