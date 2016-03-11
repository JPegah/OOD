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
	// get the user with the given id
	public static Users getUser(Long id) {
		MyUser t = MyUser.find.byId(id);
		Users u = new Users(t.eaddress, t.fname, t.lname,
				Long.parseLong(t.password));
		return u;
	}

	// find a course based on id for showing in course index page
	public static CourseGroupLogic getCourseIndex(String id) {
		CourseGroup cg = CourseGroup.find.byId(id);
		CourseGroupLogic cgl = new CourseGroupLogic(cg.courseNum,
				cg.department, cg.courseName, cg.time, cg.place);
		CourseMap cp = CourseMap.find.where().eq("coursegp", id).findList()
				.get(0);
		Professor p = Professor.find.byId(cp.prof);
		cgl.setProfessor(new ProfessorLogic(p.eaddress, p.fname, p.lname, Long
				.parseLong(p.password)));
		return cgl;
	}

	// find mailSystem for a user + threads in his/her inbox
	public static MailSystemLogic getInbox(Long id) {
		Inbox inbox = Inbox.find.byId(id);
		List<MessageThread> threads = MessageThread.find.where()
				.eq("inbox", inbox).findList();
		MailSystemLogic mail = new MailSystemLogic();
		for (int i = 0; i < threads.size(); i++) {
			MessageThreadLogic mtl = new MessageThreadLogic(
					threads.get(i).subject);
			MessageThread mt = threads.get(i);
			List<Message> messages = Message.find.where().eq("thread", mt)
					.findList();
			// here is temporary user:
			MyUser tmpuser = MyUser.find.byId(id);
			Users u = null;// new Users();
			u.setFirstName(tmpuser.fname);
			u.setLastName(tmpuser.lname);
			u.setEmail(tmpuser.eaddress);

			for (int j = 0; j < messages.size(); j++) {
				Message currentM = messages.get(j);
				MessageLogic mtmp = new MessageLogic(currentM.content,
						currentM.time, u);
				mtl.addMessage(mtmp);
			}

			mail.addMessageThread(mtl);
		}

		// List<CourseGroup> courses = CourseGroup.find.where().like("year",
		// year+"").findList();
		return mail;
	}

	// find user in database and check if username and password is valid
	public static String validateUser(String email, String password) {

		try {
			// if (email.lenght == 0 || password.length == 0)
			// return "پر کردن خانه های ستاره دار الزامی است";
			//
			MyUser user = MyUser.find.byId(Long.parseLong(email));
			if (password.equals(user.password))
				return "";

			return "نام کاربری یا رمز عبور نادرست است";
		} catch (Exception e) {
			return "نام کاربری یا رمز عبور نادرست است";
		}

	}

	// creates sample objects for db... called in when first page loaded
	public static void f(Long i) {
		Student u = new Student(new Long(90105992), "پگاه", "جندقی", "1234",
				"jandaghi@ce.sharif.edu");
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

	public static void addcourse() {
		CourseGroup cg = new CourseGroup("se shanbe", "101", 1390, 2, 1, "OOD",
				"computer", "40403");
		System.out.print("this is course Id: " + cg.id);
		Professor p = new Professor(new Long(5), "raman", "ramsin", "1234",
				"22");
		Student s = new Student(new Long(89105902), "pegah", "jandaghi",
				"1234", "90105903");

		cg.save();
		p.save();
		s.save();
		CourseMap cm = new CourseMap(p.id, s.id, cg.id);
		cm.save();
	}

	// find all courses of the given semester
	public static ArrayList<CourseGroupLogic> semesterCourses(int year,
			int semester) {
		List<CourseGroup> courses = CourseGroup.find.where()
				.like("year", year + "").findList();// .where().like("term",
													// semester+"");
		ArrayList<CourseGroupLogic> groups = new ArrayList<CourseGroupLogic>();
		for (int i = 0; i < courses.size(); i++) {
			CourseGroup c = courses.get(i);
			CourseGroupLogic tmp;// = new CourseGroupLogic(c.courseNum,
									// c.department, c.courseName);
			List<CourseMap> mp = CourseMap.find.where()
					.like("coursegp", c.toString()).findList();
			// tmp.setProfessorName(mp.get(0).prof.fname + " " +
			// mp.get(0).prof.lname);
		}
		return groups;
	}

}
