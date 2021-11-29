public class Grass implements Food{
    @Override
    public void applyFood(Critter creature) {
        System.out.println("You chose grass");
        creature.getFoodLevel(1);
        creature.getTirednessLevel(1);
    }
}
