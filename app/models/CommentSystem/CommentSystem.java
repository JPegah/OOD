package models.CommentSystem;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
public class CommentSystem extends Model {

    public CommentSystem(){

    }
    
    @Id
    private long id;
}
