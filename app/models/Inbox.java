package models;

/**
 * Created by pegah on 3/9/16.
 */
import java.util.*;
        import javax.persistence.*;

        import com.avaje.ebean.Model;
        import play.data.format.*;
        import play.data.validation.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Inbox extends Model {

    public Inbox(){

    }

    @OneToOne()
    public User user;

    public static Finder<Long, Inbox> find = new Finder<Long,Inbox>(Inbox.class);
}
