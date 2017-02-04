import Kim.Andy.PolymorphismLab1.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;

public class CatTest {
    Cat cat = new Cat("name");

    @Test
    public void catSpeakTest(){
        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}
