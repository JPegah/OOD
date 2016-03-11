package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Course extends Model {

    public Course(Long id){

        this.id = id;
    }
    
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String courseName;

    @Constraints.Required
    public String courseNum;



    public static Finder<Long, Course> find = new Finder<Long,Course>(Course.class);
}
