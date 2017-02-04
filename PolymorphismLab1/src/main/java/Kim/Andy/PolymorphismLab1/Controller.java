package Kim.Andy.PolymorphismLab1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by andykim on 1/31/17.
 */
public class Controller{

    int index;

    PetsManagement petsManagement = new PetsManagement();

    PetFactory petFactory = new PetFactory();

    Display display = new Display();

    PetCompare petCompare = new PetCompare();



    public void howManyPetsDoYouHave(){
         petsManagement.numberOfPets = display.askUserForNumberOfPetsToUseInControllerClass("How many pets you have?");
    }


    private String whatAreTheirNames() {
        return display.askUserForPetsNamesToUseInControllerClass("What its name?");
        }

    private String whatTypesAreThey(){
        return display.askUserForPetsNamesToUseInControllerClass("What its types?");
    }

    public void displayPet() {
        for(int i = 0; i < petsManagement.Pets.size(); i++){
            display.displaySinglePet(petsManagement.Pets.get(i));
        }
    }

    public void getPetInfo(){
        for(int i = 0;  i < petsManagement.numberOfPets; i++){
            petsManagement.Pets.add(i, petFactory.makeAPet(whatTypesAreThey(), whatAreTheirNames()));
        }
    }

    public void sortedPets(){
        Collections.sort(petsManagement.Pets,Pet::compareTo);
    }

    }


