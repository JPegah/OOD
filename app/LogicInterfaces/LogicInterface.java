package LogicInterfaces;

import LogicClasses.*;
import models.CourseGroup;
import models.CourseMap;
import models.MyUser;

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

    public static boolean validateUser(String email, String password){
       // try {
//            User t = User.find.by
//        }
        return true;
    }


    // creates sample objects for db... called in when first page loaded
    public static void f(Long i){
    	MyUser u = new MyUser(new Long(90105978), "پگاه", "جندقی", "1234", "jandaghi@ce.sharif.edu" );
    	u.save();
        MyUser u2 = new MyUser(new Long(90100000), "لاله", "صمدفام", "2345", "samadfam@e.sharif.edu");
        u2.save();
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
