import java.util.Scanner;

/**
 * FizzBuzz
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number
    System.out.println("Please enter a number to play FizzBuzz");
    int usersNumber = input.nextInt();

    //create constant for divisibility by 3
    final int DIVISIBLE_BY_3 = usersNumber % 3;

    //create constant for divisibility by 5
    final int DIVISIBLE_BY_5 = usersNumber % 5;

    //create a constant for a number that means the division has no remainders
    final int NO_REMAINDER = 0;

    //check to see if the number is divisible 
    if  (DIVISIBLE_BY_3 == NO_REMAINDER && DIVISIBLE_BY_5 == NO_REMAINDER ) {
      System.out.println("You should say FizzBuzz");
    } else if (DIVISIBLE_BY_5 == NO_REMAINDER){
      System.out.println("You should say Buzz");
    } else if (DIVISIBLE_BY_3 == NO_REMAINDER) {
      System.out.println("You should say Fizz");
    } else {
      System.out.println("You should say " +usersNumber);
    }
  }
}
