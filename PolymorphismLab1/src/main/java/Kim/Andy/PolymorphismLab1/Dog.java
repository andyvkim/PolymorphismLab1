package Kim.Andy.PolymorphismLab1;

/**
 * Created by andykim on 1/31/17.
 */
public class Dog extends Pet {


    public Dog(String name){
        super.setName(name);

    }
    public String speak(){
        return "woof";
    }


}
