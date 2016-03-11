package LogicClasses.Course;

import LogicClasses.User.ProfessorLogic;

/**
 * Created by pegah on 3/10/16.
 */
public class CourseGroupLogic extends CourseLogic {
    private String time;
    private String place;
	
	public CourseGroupLogic(String code, String department, String name, String time, String place){
        super(department, code, name);
        this.time = time;
        this.place = place;
    }
	

    private ProfessorLogic professor;
    public String getTime(){
    	return this.time;
    }

    public String getPlace(){
    	return this.place;
    }
    
    public String getProfessorName(){
        return this.professor.getName();
    }

    public void setProfessor(ProfessorLogic p){
        this.professor = p;
    }
}
