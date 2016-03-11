package models.Users;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("aProfessor")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Professor extends MyUser {

    public Professor(Long id, String fname, String lname, String password, String email){
    	super(id, fname, lname, password, email);
    }
    
//    @OneToOne()
//    public MyUser user;
//


    public static Finder<Long, Professor> find = new Finder<Long,Professor>(Professor.class);
}
