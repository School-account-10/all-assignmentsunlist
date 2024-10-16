import java.util.Random;
import java.util.Scanner;

public class o5handsonact2 {

  public static void main(String[] args) {
    Scanner Fruitfindeer = new Scanner(System.in);
    Random randomiser = new Random();
    String findmyfruit;
    String[] ALARGEWORDLIST = { "apple", "banana", "cherry", "date", "elderberry", "kiwi", "grape", "mango", "orange",
        "peach" }; // arrays
    boolean tf = false;
    int randomIn = randomiser.nextInt(ALARGEWORDLIST.length);

    String wordpicker = ALARGEWORDLIST[randomIn];

    System.out.println("i will give you only 2 letters of the fruit and you have to guess"); 
    int wrongdt = 1;

    while (!tf) { // loops
      String clue = wordpicker.substring(0, wrongdt) + "=".repeat(wordpicker.length() - wrongdt);
      System.out.println("");
      System.out.println("Your clue is: " + clue);
      System.out.print("whats the fruit its thinking: ");
      findmyfruit = Fruitfindeer.nextLine();
      if (findmyfruit.equalsIgnoreCase(wordpicker)) { // condions
        System.out.println("well done its a " + wordpicker);
        break;

      } else if (wrongdt == 3) {
        System.out.println("you suck at this");
        System.out.println("also stop bruteforcing the game.");
        break;

      } else {
        System.out.println("Your clue is: " + clue);
        System.out.println("womp womp try again");
        System.out.print("whats the fruit its thinking: ");
        findmyfruit = Fruitfindeer.nextLine();
        wrongdt++;
        continue;
      }
    }
  }
}