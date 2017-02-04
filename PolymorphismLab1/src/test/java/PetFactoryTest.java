import Kim.Andy.PolymorphismLab1.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;
public class PetFactoryTest {

    PetFactory petFactory =  new PetFactory();

    @Test
    public void makeAPetTest(){
        Pet expected = new Cow("Sparky");
        Pet actual = petFactory.makeAPet("Dog","Sparky");
        Assert.assertEquals(expected, actual);
    }

}
