package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Course extends Model {

    public User(Long id){
		this.id = id;
    }
    
    @Id
    @Constraints.Min(10)
    public Long id;

    public static Finder<Long, Course> find = new Finder<Long,Course>(Course.class);
}
