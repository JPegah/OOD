package LogicClasses;

/**
 * Created by pegah on 3/10/16.
 */
public class CommentLogic {
    private String commentBody;
    private int score;
    private String date;
    private String authorName;

    public CommentLogic(String commentBody, int score, String date, String authorName){
        this.commentBody = commentBody;
        this.score = score;
        this.date = date;
        this.authorName = authorName;
    }

//    public void Edit(int newScore){
//        this.score = newScore;
//    }
}
