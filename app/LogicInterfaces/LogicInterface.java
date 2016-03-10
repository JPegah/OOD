package LogicInterfaces;

import LogicClasses.*;
import models.User;
/**
 * Created by pegah on 3/8/16.
 */
public class LogicInterface {
    public static Users getUser(Long id){
        Users u = new Users();
 	User t = User.find.byId(id);
 	u.setPassword(t.id);
 	return u;
    }

    public static boolean validateUser(String email, String password){
       // try {
//            User t = User.find.by
//        }
        return true;
    }


    // creates sample objects for db... called in when first page loaded
    public static void f(Long i){
    	User u = new User(90105978, "پگاه", "جندقی", "1234", "jandaghi@ce.sharif.edu" );
    	u.save();
        User u2 = new User(90100000, "لاله", "صمدفام", "2345", "samadfam@e.sharif.edu");
        u2.save();
    }


}
