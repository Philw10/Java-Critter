public class Ham implements Food{
    @Override
    public void applyFood(Critter creature) {
        System.out.println("You chose ham");
        creature.setFoodLevel(4);
        creature.setTirednessLevel(1);
        creature.setWorkOutLevel(-2);
    }
}
