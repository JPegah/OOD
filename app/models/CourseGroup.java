package models;

/**
 * Created by pegah on 3/10/16.
 */

import java.util.ArrayList;

@Entity
@DiscriminatorValue("aCourse")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CourseGroup extends Course {

    public CourseGroup(Long id, int year, int tterm){

        super(id);
        this.tterm = tterm;
        this.year = year;
    }

    @Constraints.Required
    public int year;

    @Constraints.Required
    public int term;

    public ArrayList<CourseMaterial> cmat;


}
