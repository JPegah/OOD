package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Course extends Model {
    public Course(String id, String name, String courseCode, String department){
        this.courseName = name;
        this.courseNum = courseCode;
        this.department = department;
        this.id = id;
    }

    @Constraints.Required
    public String courseName;

    
    @Constraints.Required
    public String courseNum;

    @Constraints.Required
    public String department;

    @Id
    public String id;
    public static Finder<String, Course> find = new Finder<String,Course>(Course.class);
}
