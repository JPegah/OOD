package models;

import java.util.ArrayList;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aProject")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Project extends Model{

    public ArrayList<projectPhase> projectph;
}
