package Kim.Andy.PolymorphismLab1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by andykim on 1/31/17.
 */
public class Display {

    Scanner input = new Scanner(System.in);

    Scanner input2 = new Scanner(System.in);


    public int askUserForNumberOfPetsToUseInControllerClass(String question){
        System.out.println(question);
        return input2.nextInt();
    }


    public String askUserForPetsNamesToUseInControllerClass(String question){
        System.out.println(question);
        String response = input.nextLine();
        return response;
    }


    public void displaySinglePet(Pet pet){
        System.out.println("This is " + pet.getName() + " my pet " + pet.getClass().getSimpleName() + " who goes " + pet.speak());
    }








    }


