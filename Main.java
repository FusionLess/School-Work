import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {

  public static void main(String args[]) {

    System.out.println("*****************************************************************************************************\n \nLUCKY UNICORNS \nTHIS GAME WAS DESIGNED TO HELP AND RAISE MONEY FOR THE CHARITY DOCTORS WITHOUT BORDERS\n\n*****************************************************************************************************");

    String tokens = new String[] {"Donkey", "Horse", "Zebra", "Unicorn"}[(int)(Math.random()*4)];
    int coinAmount;
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Please input one dollar and continue"); 
        while (!sc.hasNextInt()) {
          System.out.println("That's an invalid amount. Please try again");
          sc.next();
        }
       coinAmount = sc.nextInt();
    } while (coinAmount != 1);
      System.out.println("Well done! you won a " + tokens);
  }
}