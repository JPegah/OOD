package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;


/**
 * Created by pegah on 3/10/16.
 */
@Entity
public class ProjectPhase extends Model  {

//    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date deadline = new Date();
    @Id
    private long id;


}
