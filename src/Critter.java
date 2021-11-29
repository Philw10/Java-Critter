public class Critter {
    private boolean isAlive;
    private boolean youWin;
    private int foodLevel;
    private int tiredness;
    private String critterName;
    private int workOut;

    public Critter(String critterName) {
        isAlive = true;
        youWin = false;
        foodLevel = 5;
        tiredness = 0;
        workOut = 0;
        this.critterName = critterName;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean youWin() { return youWin;}

    public void sleepSound(){
        System.out.println("Zzzz..");
    }
    public void eatSound(){
        System.out.println("munch, munch");
    }
    public void exerciseSound(){
        System.out.println("eeeeeeeekkkk");
    }

    private void die() {
        System.out.println(this.critterName + " has died.");
        isAlive = false;
    }

    private void win() {
        System.out.println("You win " + this.critterName + " is fighting fit");
        youWin = true;
    }
    
    public void sleep() {
        System.out.println(this.critterName + " sleeps");
        tiredness = 0;
        foodLevel -= 3;
        for (int i = 0; i <= 5; i++){
            try{
                Thread.sleep(1000);
                sleepSound();
            }catch (InterruptedException e) {
                // Exception used for sleep method.  No catch output.
            }
        }
        if (foodLevel <= 0) {
            System.out.println(this.critterName + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println(this.critterName + " eats.");
            eatSound();
            foodLevel++;
            tiredness++;
            if (foodLevel > 10) {
                System.out.println(this.critterName + " over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(this.critterName + " is sleepy from so much food.");
                sleep();
            }
        }
    }

    public void exercise() {
        System.out.println(this.critterName + " exercises");
        exerciseSound();
        tiredness++;
        foodLevel -= 1;
        workOut += 5;
        if (workOut == 15) {
            win();
        }
        else if (tiredness > 5) {
            System.out.println(this.critterName + " is sleepy from so much exercise.");
            sleep();
        }
        else if (foodLevel <= 0) {
            System.out.println(this.critterName + " starves to death.  They needed food to exercise");
            die();
        }

    }
}
