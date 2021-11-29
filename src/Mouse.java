public class Mouse extends Critter {

    public Mouse(String critterName) {
        super(critterName);
        System.out.println(critterName + " is a mouse!");
    }

    // Default Critter class used for sleep, and exercise sounds

    public void eatSound(){
        System.out.println("squeak, squeak");
    }

}
