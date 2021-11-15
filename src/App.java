import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your critters name?");
        String critterName = scanner.nextLine();
        Critter name = new Critter(critterName);
        while (name.isAlive() == true && name.youWin() == false) {
            System.out.println("What would you like Critter to do?");
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
