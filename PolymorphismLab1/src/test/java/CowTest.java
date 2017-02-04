import Kim.Andy.PolymorphismLab1.Cow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;

public class CowTest {

    Cow cow = new Cow("name");

    @Test
    public void cowSpeakTest(){
        String expected = "moo";
        String actual = cow.speak();
        Assert.assertEquals(expected, actual);
    }

}
