package Kim.Andy.PolymorphismLab1;

/**
 * Created by andykim on 1/31/17.
 */
public class Cat extends Pet {


    public Cat(String name){
        super.setName(name);
    }

    public String speak(){
        return "meow";
    }
}
