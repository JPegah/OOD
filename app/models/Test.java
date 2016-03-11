package models;

/**
 * Created by pegah on 3/10/16.
 */
@Entity
@DiscriminatorValue("aTest")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Test {

    public Test(){

    }
}
