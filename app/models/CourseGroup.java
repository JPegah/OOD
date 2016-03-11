package models;

/**
 * Created by pegah on 3/10/16.
 */

import java.util.ArrayList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@DiscriminatorValue("aCourse")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CourseGroup extends Course {

    public CourseGroup(int year, int tterm, int groupNumber, String name, String department, String courseNum){
        super(name, courseNum, department);
        this.term = tterm;
        this.year = year;
    }
    
    public int year;
    public int term;
    public int groupNumber;

    public ArrayList<CourseMaterial> cmat;

    public static Finder<Long, CourseGroup> find = new Finder<Long,CourseGroup>(CourseGroup.class);
    

}
