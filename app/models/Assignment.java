package models;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aAssignment")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Assignment extends Model  {

    public Assignment(){

    }
}
