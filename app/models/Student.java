package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("aStudent")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student extends MyUser {

    public Student(Long id){
    	super(id, "", "", "", "");
    }
    
    @OneToOne()
    public MyUser user;
    
    @Constraints.Min(10)
    public Long StudentID;


    public static Finder<Long, Student> find = new Finder<Long,Student>(Student.class);
}
