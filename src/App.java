import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Critter name = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your critters name?");
        String critterName = scanner.nextLine();
        System.out.println("Which critter would you like to play with?\n1. Rabbit\n2. Mouse\n3. Hedgehog");
        String critterType = scanner.nextLine();
        if (critterType.equals("1")) {
            name = new Rabbit(critterName);
        } else if (critterType.equals("2")) {
            name = new Mouse(critterName);
        } else if (critterType.equals("3")) {
            name = new Hedgehog(critterName);
        }


        while (name.isAlive() == true && name.youWin() == false) {
          System.out.println("What would you like to do?");
        String lineRead = scanner.nextLine();
           if (lineRead.equalsIgnoreCase("eat")) {
                whatToEat(name);
           } else if (lineRead.equalsIgnoreCase("sleep")) {
                name.sleep();
           } else if (lineRead.equalsIgnoreCase("exercise")) {
                name.exercise();
           }
        }
        scanner.close();
    }

    public static void whatToEat(Critter name){
        Scanner scanner = new Scanner(System.in);
        Food food = null;
        System.out.println("What would you like " + name.getName() + " to eat?");
        System.out.println("1. Seed\n2. Grass\n3. Ham");
        String critterFoodType = scanner.nextLine();
        if (critterFoodType.equals("1")){
            food = new Seed();
        }else if (critterFoodType.equals("2")){
            food = new Grass();
        }else if (critterFoodType.equals("3")){
            food = new Ham();
        }
        name.feed(food);
    }
}
