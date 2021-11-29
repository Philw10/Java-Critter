public class Ham implements Food{
    @Override
    public void applyFood(Critter creature) {
        System.out.println("You chose ham");
        creature.getFoodLevel(4);
        creature.getTirednessLevel(1);
        creature.getWorkOutLevel(-2);
    }
}
