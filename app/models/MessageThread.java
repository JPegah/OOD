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

    @OneToMany()
    public Message message;
    
    @Id
    private long id;
    
    public String subject;
    
    public static Finder<Long, MessageThread> find = new Finder<Long,MessageThread>(MessageThread.class);
}
