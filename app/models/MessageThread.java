package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MessageThread extends Model {

    public MessageThread(){
    }

    @Id
    @Constraints.Min(10)
    public Long id;

    public static Finder<Long, MessageThread> find = new Finder<Long,MessageThread>(MessageThread.class);
}
