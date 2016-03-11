package models.Course;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
public class Grade extends Model {

    public int value;
    @Id
    private long id;

}
