public class Grass implements Food{
    @Override
    public void applyFood(Critter creature) {
        System.out.println("You chose grass");
        creature.setFoodLevel(1);
        creature.setTirednessLevel(1);
    }
}
