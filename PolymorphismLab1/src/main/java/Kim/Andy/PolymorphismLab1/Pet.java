package Kim.Andy.PolymorphismLab1;


public abstract class Pet implements Comparable <Pet>{



    @Override
    public int compareTo(Pet pet) {
        int compareResults = this.compareNames(pet);
        if(compareResults == 0){
            compareResults = this.compareTypes(pet);
        }
        return compareResults;

    }

    private String name;

    protected String speak(){
        return null;
    };


    public String getName() {
        return name;
    }

    public String setName(String name) {return this.name = name;}

    public int compareNames(Pet pet){
        return this.name.compareTo(pet.getName());

    }
    public int compareTypes(Pet pet){
        return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
    }

}
