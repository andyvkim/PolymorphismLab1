import Kim.Andy.PolymorphismLab1.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;
public class PetsManagementTest {

    Dog dog = new Dog("Sparky");
    Cat cat = new Cat("Fluffy");
    PetCompare petCompare = new PetCompare();

    @Test
    public void compareTest() {
        int expected = 0;
        int actual = petCompare.compare(dog, cat);
        Assert.assertEquals(expected, actual);
    }


}