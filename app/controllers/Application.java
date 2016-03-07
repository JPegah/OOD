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
        return ok(Courses.render("لیست دروس"));
    }

    public Result LogIn(){
        return ok(LogIn.render("ورود"));
    }

    public Result ChangePass(){
        return ok(ChangePass.render("تغییر رمز"));
    }

    public Result ForgetPass(){
        return ok(ForgetPass.render("فراموشی رمز"));
    }

    public Result MessageThread(){
        return ok(MessageThread.render("ریسه ی ‍‍پیام"));
    }

    public Result Inbox(){
    	Long x = new Long(1);
    	LogicInterface.f(x);
        return ok(Inbox.render("صندوق پیام", LogicInterface.getUser(x)));
    }

    public Result Upload(Long id){
        return ok(UploadBox.render("صندوق بارگذاری"));
    }

//    public Result CourseIndex(Long id){
//        return ok(CourseIndex.courseIndex.render(""));
//    }

    public Result Comment(Long id){
        return ok(views.html.CourseIndex.comment.render("مشاهده نظرات"));
    }

    public Result newComment(Long id){
        return ok(views.html.CourseIndex.newComment.render("افزودن نظر"));
    }

    public Result CourseIndex(Long id){
        return ok(views.html.CourseIndex.courseIndex.render("نمایه درس"));
    }

    public Result Exams(Long id, Long eId){
        return ok(views.html.CourseIndex.Exams.render("امتحانات"));
    }

    public Result Projects(Long id, Long pId){
        return ok(views.html.CourseIndex.Projects.render("پروژه ها"));
    }

    public Result CourseDescription(Long id){
        return ok(views.html.CourseIndex.StudentView.CourseDesc.render("طرح  درس"));
    }

    public Result Grades(Long id){
        return ok(views.html.CourseIndex.StudentView.Grades.render("مشاهده نمرات"));
    }

    public Result ProjectInd(Long id, Long p_id){
        return ok(views.html.CourseIndex.StudentView.ProjectInd.render("نمایه پروژه"));
    }
    public Result Resources(Long id){
        return ok(views.html.CourseIndex.StudentView.Resources.render("منابع درس"));
    }

    public Result AddGrade(Long id){
        return ok(views.html.CourseIndex.ProfView.AddGrade.render("افزودن نمره"));
    }

    public Result EditDescription(Long id){
        return ok(views.html.CourseIndex.ProfView.EditDescription.render("ویرایش طرح درس"));
    }

    public Result EditGrades(Long id){
        return ok(views.html.CourseIndex.ProfView.EditGrades.render("ویرایش نمرات"));
    }
    public Result EditProject(Long id){
        return ok(views.html.CourseIndex.ProfView.EditProject.render("ویرایش پروژه"));
    }

    public Result EditResources(Long id){
        return ok(views.html.CourseIndex.ProfView.EditResources.render("ویرایش منابع"));
    }

    public Result ProjectEdit(Long id, Long p_id){
        return ok(views.html.CourseIndex.ProfView.ProjectsEdit.render("ویرایش پروژه"));
    }

}

