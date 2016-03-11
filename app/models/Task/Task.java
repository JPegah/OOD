package models.Task;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.avaje.ebean.Model;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Task extends Model {

    public Task(){

    }
    
    @Id
    private long id;


}
