package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aResource")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Resources extends CourseMaterial {

    public Resources(){

    }
    @Id
    private long id;
}
