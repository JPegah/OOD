package controllers;

import LogicInterfaces.*;
import play.*;
import play.mvc.*;
import play.data.Form;

import views.html.*;




public class Application extends Controller {

//    public Result index() {
//        return ok(index.render("Your new application is ready."));
//    }
public Result authenticate() {
	Form<Login> loginForm = Form.form(Login.class);
    Login login = loginForm.bindFromRequest().get();
    System.out.print(login.email);
    return ok();
}


public static class Login {
    public String email;
    public String password;

    public static String authenticate(String email, String password){
        if (validateUser(email, password))
            return null;
        return "Invalid username or password";
    }

}
 
	

	public String validate() {
		if (Login.authenticate(email, password) == null)
			return "Invalid user or password";
		return null;
	}


    public Result LogIn() {
        return ok(
                LogIn.render("ورود",Form.form(Login.class))
        );
    }

    public Result Courses(){
    	Long x = new Long(1);
    	LogicInterface.f(x);
        return ok(Courses.render("لیست دروس",LogicInterface.getUser(x)));
    }
//
//    public Result LogIn(){
//        return ok(LogIn.render("ورود"));
//    }
/*
    public Result ChangePass(){
        return ok(ChangePass.render("تغییر رمز"));
    }

    public Result ForgetPass(){
        return ok(ForgetPass.render("فراموشی رمز"));
    }

    public Result MessageThread(){
        return ok(MessageThread.render("ریسه ی ‍‍پیام", LogicInterface.getUser(x)));
    }

    public Result Inbox(){
    	Long x = new Long(1);
    	LogicInterface.f(x);
        return ok(Inbox.render("صندوق پیام", LogicInterface.getUser(x)));
    }

    public Result Upload(Long id){
        return ok(UploadBox.render("صندوق بارگذاری", LogicInterface.getUser(x)) );
    }

//    public Result CourseIndex(Long id){
//        return ok(CourseIndex.courseIndex.render(""));
//    }

    public Result Comment(Long id){
        return ok(views.html.CourseIndex.comment.render("مشاهده نظرات",LogicInterface.getUser(x)));
    }

    public Result newComment(Long id){
        return ok(views.html.CourseIndex.newComment.render("افزودن نظر",LogicInterface.getUser(x)));
    }

    public Result CourseIndex(Long id){
        return ok(views.html.CourseIndex.courseIndex.render("نمایه درس",LogicInterface.getUser(x)));
    }

    public Result Exams(Long id, Long eId){
        return ok(views.html.CourseIndex.Exams.render("امتحانات",LogicInterface.getUser(x)));
    }

    public Result Projects(Long id, Long pId){
        return ok(views.html.CourseIndex.Projects.render("پروژه ها",LogicInterface.getUser(x)));
    }

    public Result CourseDescription(Long id){
        return ok(views.html.CourseIndex.StudentView.CourseDesc.render("طرح  درس",LogicInterface.getUser(x)));
    }

    public Result Grades(Long id){
        return ok(views.html.CourseIndex.StudentView.Grades.render("مشاهده نمرات",LogicInterface.getUser(x)));
    }

    public Result ProjectInd(Long id, Long p_id){
        return ok(views.html.CourseIndex.StudentView.ProjectInd.render("نمایه پروژه",LogicInterface.getUser(x)));
    }
    public Result Resources(Long id){
        return ok(views.html.CourseIndex.StudentView.Resources.render("منابع درس",LogicInterface.getUser(x)));
    }

    public Result AddGrade(Long id){
        return ok(views.html.CourseIndex.ProfView.AddGrade.render("افزودن نمره",LogicInterface.getUser(x)));
    }

    public Result EditDescription(Long id){
        return ok(views.html.CourseIndex.ProfView.EditDescription.render("ویرایش طرح درس",LogicInterface.getUser(x)));
    }

    public Result EditGrades(Long id){
        return ok(views.html.CourseIndex.ProfView.EditGrades.render("ویرایش نمرات",LogicInterface.getUser(x)));
    }
    public Result EditProject(Long id){
        return ok(views.html.CourseIndex.ProfView.EditProject.render("ویرایش پروژه",LogicInterface.getUser(x)));
    }

    public Result EditResources(Long id){
        return ok(views.html.CourseIndex.ProfView.EditResources.render("ویرایش منابع",LogicInterface.getUser(x)));
    }

    public Result ProjectEdit(Long id, Long p_id){
        return ok(views.html.CourseIndex.ProfView.ProjectsEdit.render("ویرایش پروژه",LogicInterface.getUser(x)));
    }
*/
}

