package models;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

@Entity
public class MessageThread extends Model {

    public MessageThread(String subject){
    	this.subject = subject;
    }

    @OneToMany()
    public Message message;
    
    @ManyToOne()
    public Inbox inbox;
    
    @Id
    private long id;
    
    public String subject;
    
    public static Finder<Long, MessageThread> find = new Finder<Long,MessageThread>(MessageThread.class);
}
