package LogicClasses;

/**
 * Created by pegah on 3/8/16.
 */
public class Users {
    private Long password;
    private String firstName;
    private String lastName;
    private String email;

    public Users(String email, String firstName, String lastName, Long password){
    	this.email = email;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
    	return firstName + " " + lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public Long getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
