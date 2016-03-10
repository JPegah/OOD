package LogicClasses;

import java.util.ArrayList;
/**
 * Created by pegah on 3/9/16.
 */
public class MessageThreadLogic {
    private String subject;
    public ArrayList<MessageLogic> messages;
    public MessageThreadLogic(String subject){
        this.subject = subject;
        this.messages = new ArrayList<MessageLogic>();
    }
}
