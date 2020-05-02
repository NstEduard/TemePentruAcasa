public class HerbivoreAnimal extends TerestrialAnimals {
    private boolean eatPlants;

    public HerbivoreAnimal(String color,int memberNumber,String specimen,String move,boolean hunt,boolean eatPlants){
        this.color=color;
        this.memberNumber=memberNumber;
        this.specimen=specimen;
        this.move=move;
        this.hunt=hunt;
        this.eatPlants=eatPlants;

    }
    public boolean getEatPlants(){
        return eatPlants;
    }
    public String bites(){
        return "This animal doesn t bites";
    }
}
