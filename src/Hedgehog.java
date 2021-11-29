public class Hedgehog extends Critter{

    public Hedgehog(String critterName) {
        super(critterName);
        System.out.println(critterName + " is a hedgehog!");
    }
    public void sleepSound(){
        System.out.println("Snore, snort");
    }
    public void eatSound(){
        System.out.println("Oink, oink");
    }
    public void exerciseSound(){
        System.out.println("Phew");
    }
}
