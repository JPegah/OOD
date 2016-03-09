package models;

/**
 * Created by pegah on 3/9/16.
 */
package models;
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

    @Id
    @Constraints.Min(10)
    public Long id;



    public static Finder<Long, Inbox> find = new Finder<Long,Inbox>(Inbox.class);
}
