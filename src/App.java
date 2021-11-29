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
                name.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                name.sleep();
            } else if (lineRead.equalsIgnoreCase("exercise")) {
                name.exercise();
           }
        }
        scanner.close();
    }
}
