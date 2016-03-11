package LogicClasses.MailSystem;

import LogicClasses.User.Users;

/**
 * Created by pegah on 3/9/16.
 */
public class MessageLogic {
    private Users initiator;
    private String content;
    private String time;

    public MessageLogic(String content, String time, Users initiator){
        this.content = content;
        this.time = time;
        this.initiator = initiator;
    }
    
    public String getContent(){
    	return this.content;
    }
    
    public String getTime(){
    	return this.time;
    }
    
    public String getWriter(){
    	return this.initiator.getFirstName() + " " + this.initiator.getLastName();
    }
}
