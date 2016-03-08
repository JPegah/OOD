
package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class CourseMap extends Model {

    public CourseMap(Long id){
		this.id = id;
    }

    @OneToMany()
    public Professor prof;
    
    @OneToMany()
    public Student stu;
    

    

    public static Finder<Long, Course> find = new Finder<Long,Course>(Course.class);
}
