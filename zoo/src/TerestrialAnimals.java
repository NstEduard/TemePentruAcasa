public class TerestrialAnimals extends Animal {

    protected String move;
    protected boolean hunt;

    public TerestrialAnimals(String color,int memberNumber,String specimen ,String move,boolean hunt){
        this.color=color;
        this.memberNumber=memberNumber;
        this.specimen=specimen;
        this.move=move;
        this.hunt=hunt;

    }
    public TerestrialAnimals(){

    }
    public String getMove(){
        return move;
    }
    public boolean getHunt(){
        return hunt;
    }
    public String bites(){
        return "This animal bites on land";
    }

}
