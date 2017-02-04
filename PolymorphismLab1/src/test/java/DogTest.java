import Kim.Andy.PolymorphismLab1.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;

public class DogTest {

    Dog dog = new Dog("sparky");

    @Test
    public void dogSpeakTest(){
        String expected =  "bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
