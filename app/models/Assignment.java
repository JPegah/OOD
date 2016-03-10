package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.avaje.ebean.Model;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aAssignment")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Assignment extends Model  {

    public Assignment(){

    }
    
    @Id
    private long id;
}
