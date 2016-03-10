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
public class Message extends Model {

    public Message(String content, String time, String writer){
    	this.content = content;
    	this.writer = writer;
    	this.time = time;
    }

    @Id
    @Constraints.Min(10)
    public Long id;

    @ManyToOne
    public MessageThread thread;
    
    
    public String content;
    
    public String time;
    public String writer;
    
    public static Finder<Long, Message> find = new Finder<Long,Message>(Message.class);
}
