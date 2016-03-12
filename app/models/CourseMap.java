
package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class CourseMap extends Model {

    public CourseMap(long p, long s, String cg){
        this.prof = p;
        this.stu = s;
        this.coursegp = cg;
    	
    }

    public long  prof;
    public long stu;
    public String coursegp;


    @Id
    private long id;
    
    public static Finder<Long, CourseMap> find = new Finder<Long,CourseMap>(CourseMap.class);
}
