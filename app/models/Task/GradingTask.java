package models.Task;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aGradingTask")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GradingTask extends Task {

    public GradingTask(){

    }
    @Id
    private long id;
}
