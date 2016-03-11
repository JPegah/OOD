package LogicClasses.CommentSystem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by pegah on 3/10/16.
 */
public class CommentSystemLogic {
    ArrayList<String> commentableCourseMaterial;
    HashMap<String, ArrayList<CommentLogic>> materialCommentMap;

    public CommentSystemLogic(){
        this.commentableCourseMaterial = new ArrayList<String>();
        this.materialCommentMap = new HashMap<>();
    }
}
