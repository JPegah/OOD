package models;

import java.util.ArrayList;

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
@DiscriminatorValue("aProject")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Project extends Model{

    public ArrayList<ProjectPhase> projectph;
    @Id
    private long id;
}
