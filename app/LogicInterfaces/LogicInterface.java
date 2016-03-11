package LogicInterfaces;

import LogicClasses.*;
import models.CourseGroup;
import models.CourseMap;
import models.Inbox;
import models.Message;
import models.MessageThread;
import models.MyUser;
import models.Professor;
import models.Student;

import java.util.List;
import java.util.ArrayList;


/**
 * Created by pegah on 3/8/16.
 */
public class LogicInterface {
    public static Users getUser(Long id){
    	MyUser t = MyUser.find.byId(id);
        Users u = new Users(t.eaddress, t.fname, t.lname, Long.parseLong(t.password));
 	    return u;
    }
    
    public static CourseGroupLogic getCourseIndex(String id){
    	CourseGroup cg = CourseGroup.find.byId(id);
    	CourseGroupLogic cgl = new CourseGroupLogic(cg.courseNum, cg.department, cg.courseName, cg.time, cg.place);
    	//CourseMap cp = CourseMap.find.where().eq("coursegp", cg).findUnique();
    	//cgl.setProfessor(new ProfessorLogic(cp.prof.eaddress, cp.prof.fname, cp.prof.lname, Long.parseLong(cp.prof.password)));
    	return cgl;
    }

    public static MailSystemLogic getInbox(Long id){
    	Inbox inbox = Inbox.find.byId(id);
    	List<MessageThread> threads = MessageThread.find.where().eq("inbox", inbox).findList();
    	MailSystemLogic mail = new MailSystemLogic();
    	for (int i = 0; i < threads.size(); i++){
    		MessageThreadLogic mtl = new MessageThreadLogic(threads.get(i).subject);
    		MessageThread mt = threads.get(i);
    		List<Message> messages = Message.find.where().eq("thread", mt).findList();
    		//here is temporary user:
    		MyUser tmpuser = MyUser.find.byId(id);
    		Users u = null;//new Users();
    		u.setFirstName(tmpuser.fname);
    		u.setLastName(tmpuser.lname);
    		u.setEmail(tmpuser.eaddress);
    		
    		for (int j = 0;j < messages.size(); j++){
    			Message currentM = messages.get(j);
    			MessageLogic mtmp = new MessageLogic(currentM.content, currentM.time, u);
    			mtl.addMessage(mtmp);
    		}
    	
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

    public static void addcourse(){
    	CourseGroup cg = new CourseGroup("se shanbe", "101", 1390, 2, 1, "OOD", "computer", "40403");
    	System.out.print("this is course Id: " + cg.id);
    	Professor p = new Professor(new Long(5), "raman", "ramsin", "1234", "22");
    	Student s = new Student(new Long(89105902), "pegah", "jandaghi", "1234", "90105903");
    	cg.save();
    	p.save();
    	s.save();
    	CourseMap cm = new CourseMap();
    	cm.prof = p;
    	cm.stu = s;
    	cm.coursegp = cg;
    	cm.save();
    	
    }

    // find all courses of the given semester
    public static ArrayList<CourseGroupLogic> semesterCourses(int year, int semester){
        List<CourseGroup>  courses = CourseGroup.find.where().like("year", year+"").findList();//.where().like("term", semester+"");
        ArrayList<CourseGroupLogic> groups = new ArrayList<CourseGroupLogic>();
        for (int i = 0; i < courses.size(); i++){
            CourseGroup c = courses.get(i);
            CourseGroupLogic tmp ;//= new CourseGroupLogic(c.courseNum, c.department, c.courseName);
            List<CourseMap> mp = CourseMap.find.where().like("coursegp", c.toString()).findList();
//            tmp.setProfessorName(mp.get(0).prof.fname + " " + mp.get(0).prof.lname);
        }
        return groups;
    }
    
    


}
