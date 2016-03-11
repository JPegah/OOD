package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Course extends Model {

    public Course(String name, String courseCode, String department){
        this.courseName = name;
        this.courseNum = courseCode;
        this.department = department;
    }

    @Constraints.Required
    public String courseName;

    @Id
    @Constraints.Required
    public String courseNum;

    @Constraints.Required
    public String department;

    public static Finder<Long, Course> find = new Finder<Long,Course>(Course.class);
}
