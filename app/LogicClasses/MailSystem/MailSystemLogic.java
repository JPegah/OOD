package LogicClasses.MailSystem;

import java.util.ArrayList;

/**
 * Created by pegah on 3/9/16.
 */
public class MailSystemLogic {
    ArrayList<MessageThreadLogic> messages;

    public MailSystemLogic(){
        this.messages = new ArrayList<>();
    }
    
    public void addMessageThread(MessageThreadLogic email){
    	this.messages.add(email);
    }
    
    public ArrayList<MessageThreadLogic> getThreads(){
    	return this.messages;
    }
}
