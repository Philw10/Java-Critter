public class Seed implements Food{
    @Override
    public void applyFood(Critter creature) {
        System.out.println("You chose seed");
        creature.setFoodLevel(3);
        creature.setTirednessLevel(2);
    }
}
