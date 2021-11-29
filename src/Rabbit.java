public class Rabbit extends Critter {

    public Rabbit(String critterName) {
        super(critterName);
        System.out.println(critterName + " is a rabbit!");
    }

    public void sleepSound(){
        System.out.println("Tut, tut");  //Apparently rabbits tut whilst sleeping!
    }
    public void eatSound(){
        System.out.println("Clack, clack");
    }
    public void exerciseSound(){
        System.out.println("Whats up doc!");
    }
}
