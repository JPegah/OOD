package models.Users;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MyUser extends Model {

    public MyUser(Long id, String fname, String lname, String password, String eaddress){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.eaddress = eaddress;
    }
    
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String fname;

    @Constraints.Required
    public String lname;

    @Constraints.Required
    public String password;

    @Constraints.Required
    public String eaddress;

//    @Constraints.Required
    public long inboxID;	

    public static Finder<Long, MyUser> find = new Finder<Long,MyUser>(MyUser.class);
}
