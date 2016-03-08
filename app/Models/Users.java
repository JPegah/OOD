package Models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Users extends Model {

    @Id
    @Constraints.Min(10)
    @Constraints.Required
    public Long id;

    public Users(Long id){
        this.id = id;
    }
    /*
    @Constraints.Required
    public String fname;

    @Constraints.Required
    public String lname;

    @Constraints.Required
    public String password;

    @Constraints.Required
    public String eaddress;

    //@Constraints.Required
    //public long inboxID;

 /*   @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date dueDate = new Date();

    public static Finder<Long, Task> find = new Finder<Long,Task>(Task.class);*/
}
