import Kim.Andy.PolymorphismLab1.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;

public class PetTest {

    Pet dog1 = new Dog("Roof");
    Pet dog2 = new Dog("Ruff");

    @Test
    public void dog1dog2Test(){

        Assert.assertTrue(0 > dog1.compareTo(dog2));


}
}
