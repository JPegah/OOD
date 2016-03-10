package LogicClasses;

/**
 * Created by pegah on 3/10/16.
 */
public class CourseGroupLogic extends CourseLogic {
    public CourseGroupLogic(String code, String department, String name){
        super(department, code, name);
    }

    private String professorName;


    public String getProfessorName(){
        return this.professorName;
    }

    public void setProfessorName(String name){
        this.professorName = name;
    }
}
