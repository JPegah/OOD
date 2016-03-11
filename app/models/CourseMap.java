
package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class CourseMap extends Model {

    public CourseMap(){
	
    }

    @OneToMany()
    public Professor prof;
    
    @OneToMany()
    public Student stu;

    @OneToMany()
    public CourseGroup coursegp;


    @Id
    private long id;
    
    public static Finder<Long, CourseMap> find = new Finder<Long,CourseMap>(CourseMap.class);
}
