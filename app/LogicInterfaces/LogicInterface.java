package LogicInterfaces;

import LogicClasses.*;
import models.CourseGroup;
import models.CourseMap;
import models.Inbox;
import models.Message;
import models.MessageThread;
import models.MyUser;
import models.Student;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by pegah on 3/8/16.
 */
public class LogicInterface {
    public static Users getUser(Long id){
        Users u = new Users();
 	    MyUser t = MyUser.find.byId(id);
 	    u.setPassword(t.id);
 	    return u;
    }

    public static MailSystemLogic getInbox(Long id){
    	Inbox inbox = Inbox.find.byId(id);
    	List<MessageThread> threads = MessageThread.find.where().eq("inbox", inbox).findList();
    	MailSystemLogic mail = new MailSystemLogic();
    	for (int i = 0; i < threads.size(); i++){
    		MessageThreadLogic mtl = new MessageThreadLogic(threads.get(i).subject);
//    		MessageThread mt = threads.get(i);
    		mail.addMessageThread(mtl);
    	}
    	
    	
        //List<CourseGroup>  courses = CourseGroup.find.where().like("year", year+"").findList();
    	return mail;
    }
    
    
    public static boolean validateUser(String email, String password){
       try {
    	   MyUser user = MyUser.find.byId(Long.parseLong(email));
    	   if (password.equals(user.password))
    		   return true;
    	   System.out.print("User passet dorost bud");
    	   return false;
       } catch (Exception e) {
    	   System.out.print("hi loooser");
    	   return false;
       }
      
    }


    // creates sample objects for db... called in when first page loaded
    public static void f(Long i){
    	Student u = new Student(new Long(90105992), "پگاه", "جندقی", "1234", "jandaghi@ce.sharif.edu" );
    	Inbox box = new Inbox(new Long(90105992));
    	u.save();
    	box.user = u;
    	box.save();

    	MessageThread m = new MessageThread("hi");
        m.inbox = box;
        m.save();
        Message m1 = new Message("salam pegah", "1/1/92", "Pegah Jandaghi");
        m1.thread = m;
        Message m2 = new Message("salam Laleh", "2/2/93", "rezvan sherkati");
        m2.thread = m;
        m1.save();
        m2.save();
        m.save();
    }



    // find all courses of the given semester
    public static ArrayList<CourseGroupLogic> semesterCourses(int year, int semester){
        List<CourseGroup>  courses = CourseGroup.find.where().like("year", year+"").findList();//.where().like("term", semester+"");
        ArrayList<CourseGroupLogic> groups = new ArrayList<CourseGroupLogic>();
        for (int i = 0; i < courses.size(); i++){
            CourseGroup c = courses.get(i);
            CourseGroupLogic tmp = new CourseGroupLogic(c.courseNum, c.department, c.courseName);
            List<CourseMap> mp = CourseMap.find.where().like("coursegp", c.toString()).findList();
            tmp.setProfessorName(mp.get(0).prof.fname + " " + mp.get(0).prof.lname);
        }
        return groups;
    }


}
