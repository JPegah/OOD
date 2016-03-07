package controllers;

import LogicClasses.Users;
import Models.User;
/**
 * Created by pegah on 3/8/16.
 */
public class LogicInterface {
    public static Users getUser(Long id){
        Users u = new Users();
 	User t;// = User.find.byId(id);
 	u.setfirstName(t.id);
 	return u;
    }
    
    public static void f(Long i){
    	User u = new User(i);
    	User.save(u);
    }
}
