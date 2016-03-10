package models;


/**
 * Created by pegah on 3/10/16.
 */
@Entity
public class ProjectPhase extends Model  {

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date deadline = new Date();


}
