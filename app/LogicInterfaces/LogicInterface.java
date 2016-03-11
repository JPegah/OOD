package LogicInterfaces;

import LogicClasses.*;
import models.CourseGroup;
import models.CourseMap;
import models.User;

import java.util.ArrayList;

/**
 * Created by pegah on 3/8/16.
 */
public class LogicInterface {
    public static Users getUser(Long id){
        Users u = new Users();
 	    User t = User.find.byId(id);
 	    u.setPassword(t.id);
 	    return u;
    }

    public static boolean validateUser(String email, String password){
       // try {
//            User t = User.find.by
//        }
        return true;
    }


    // creates sample objects for db... called in when first page loaded
    public static void f(Long i){
    	User u = new User(new Long(90105978), "پگاه", "جندقی", "1234", "jandaghi@ce.sharif.edu" );
    	u.save();
        User u2 = new User(new Long(90100000), "لاله", "صمدفام", "2345", "samadfam@e.sharif.edu");
        u2.save();
    }



    // find all courses of the given semester
    public static ArrayList<CourseGroup> semesterCourses(int year, int semester){
        ArrayList<CourseGroup>  courses = CourseGroup.find.where().like("year", year).where().like("term", semester);
        ArrayList<CourseGroupLogic> groups = new ArrayList<CourseGroupLogic>();
        for (int i = 0; i < courses.size(); i++){
            CourseGroup c = courses.get(i);
            CourseGroupLogic tmp = new CourseGroupLogic(c.courseNum, c.department, c.courseName);
            CourseMap mp = CourseMap.find.where().like("coursegp", c);
            tmp.setProfessorName(mp.prof.fname + " " + mp.prof.lname);
        }
        return courses;
    }


}
