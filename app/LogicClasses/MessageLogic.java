package LogicClasses;

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
}
