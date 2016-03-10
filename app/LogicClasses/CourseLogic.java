package LogicClasses;

/**
 * Created by pegah on 3/10/16.
 */
public class CourseLogic {
    private String department;
    private String code;
    private String name;

    public CourseLogic(String department, String code, String name){
        this.department = department;
        this.code = code;
        this.name = name;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

}
