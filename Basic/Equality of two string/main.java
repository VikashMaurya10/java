import java.util.Scanner;

public class main {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("You are playing the game! press 'q' and 'Q' for exit.");

    String response = scan.next();

    // if (response.equals("q") || response.equals("Q")) {
    //   System.out.println("You quit the game!");
    // } else {
    //   System.out.println("You still playing the game!");
    // }
    if (!response.equals("q") && !response.equals("Q")) {
      System.out.println("You quit the game!");
    } else {
      System.out.println("You still playing the game!");
    }
  }
}
