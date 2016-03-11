package models.CourseMaterial;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
public class CourseMaterial extends Model{

    public CourseMaterial(){

    }
    @Id
    private long id;

}
