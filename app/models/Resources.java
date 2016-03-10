package models;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aResource")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Resources extends CourseMaterial {

    public Resources(){

    }
}
