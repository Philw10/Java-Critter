public class Seed implements Food{
    @Override
    public void applyFood(Critter creature) {
        System.out.println("You chose seed");
        creature.getFoodLevel(3);
        creature.getTirednessLevel(2);
    }
}
