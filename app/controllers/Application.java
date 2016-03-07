package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;

import views.html.*;




public class Application extends Controller {

//    public Result index() {
//        return ok(index.render("Your new application is ready."));
//    }

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

    public Result Comment(Long id){
        return ok(views.html.CourseIndex.comment.render(""));
    }

    public Result newComment(Long id){
        return ok(views.html.CourseIndex.newComment.render(""));
    }

    public Result CourseIndex(Long id){
        return ok(views.html.CourseIndex.courseIndex.render(""));
    }

    public Result Exams(Long id, Long eId){
        return ok(views.html.CourseIndex.Exams.render(""));
    }

    public Result Projects(Long id, Long pId){
        return ok(views.html.CourseIndex.Projects.render(""));
    }

    public Result CourseDescription(Long id){
        return ok(views.html.CourseIndex.StudentView.CourseDesc.render(""));
    }

    public Result Grades(Long id){
        return ok(views.html.CourseIndex.StudentView.Grades.render(""));
    }

    public Result ProjectInd(Long id, Long p_id){
        return ok(views.html.CourseIndex.StudentView.ProjectInd.render(""));
    }
    public Result Resources(Long id){
        return ok(views.html.CourseIndex.StudentView.Resources.render(""));
    }

    public Result AddGrade(Long id){
        return ok(views.html.CourseIndex.ProfView.AddGrade.render(""));
    }

    public Result EditDescription(Long id){
        return ok(views.html.CourseIndex.ProfView.EditDescription.render(""));
    }

    public Result EditGrades(Long id){
        return ok(views.html.CourseIndex.ProfView.EditGrades.render(""));
    }
    public Result EditProject(Long id){
        return ok(views.html.CourseIndex.ProfView.EditProject.render(""));
    }

    public Result EditResources(Long id){
        return ok(views.html.CourseIndex.ProfView.EditResources.render(""));
    }

    public Result ProjectEdit(Long id, Long p_id){
        return ok(views.html.CourseIndex.ProfView.ProjectsEdit.render(""));
    }

}

