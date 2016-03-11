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

    public CourseGroup(String time, String place,int year, int tterm, int groupNumber, String name, String department, String courseNum){
        super(courseNum + year + tterm + groupNumber, name, courseNum, department);
        this.term = tterm;
        this.year = year;
        this.place = place;
        this.time = time;
        this.groupNumber = groupNumber;
    }
    
    public int year;
    public int term;
    public int groupNumber;
    public String time;
    public String place;
    
    @Id
    public String id;
    
    public ArrayList<CourseMaterial> cmat;

    public static Finder<String, CourseGroup> find = new Finder<String,CourseGroup>(CourseGroup.class);
    
}
