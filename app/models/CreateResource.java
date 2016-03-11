package models;

/**
 * Created by pegah on 3/10/16.
 */

@Entity
@DiscriminatorValue("aCreateTask")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CreateResource extends Task {
}
