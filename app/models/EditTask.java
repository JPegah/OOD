package models;

import com.sun.xml.internal.ws.api.pipe.TubelineAssemblerFactory;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aEditTask")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class EditTask extends Task {

    public EditTask(){

    }

}
