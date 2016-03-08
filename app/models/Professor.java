package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("aProfessor")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Professor extends User {

    public Professor(Long id){
    	super(id);
    }
    
    @OneToOne()
    public User user;
    
    @Constraints.Min(10)
    public Long StudentID;

    public static Finder<Long, Professor> find = new Finder<Long,Professor>(Professor.class);
}
