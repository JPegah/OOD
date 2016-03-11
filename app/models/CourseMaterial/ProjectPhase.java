package models.CourseMaterial;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;


/**
 * Created by pegah on 3/10/16.
 */
@Entity
public class ProjectPhase extends Model  {

    //@Formats.DateTime(pattern="dd/MM/yyyy")
    public String deadline;
    @Id
    private long id;

    public static Finder<Long, ProjectPhase> find = new Finder<Long,ProjectPhase>(ProjectPhase.class);


}
