package models;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Task extends Model {

    public Task(){

    }


}
