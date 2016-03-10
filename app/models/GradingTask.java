package models;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aGradingTask")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GradingTask extends Task {

    public GradingTask(){

    }
}
