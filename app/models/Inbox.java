
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
public class Inbox extends Model {
	public Inbox(long id){
		this.id = id;
	}
	
    @OneToOne()
    public MyUser user;

    @OneToMany()
    public MessageThread threads;
    
    @Id
    public long id;
    public static Finder<Long, Inbox> find = new Finder<Long,Inbox>(Inbox.class);
}