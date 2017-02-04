package Kim.Andy.PolymorphismLab1;

import java.util.ArrayList;

/**
 * Created by andykim on 1/31/17.
 */
public class PetFactory extends Pet{



    public Pet makeAPet(String type, String name){
        switch(type.toLowerCase()){

            case "dog" :
                return new Dog(name);

            case "cat" :
                return new Cat(name);

            case "cow" :
                return new Cow(name);

            default : return new Dog(name);
        }

    }
}
