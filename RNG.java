import java.util.Random;
import java.util.Scanner;

public class RNG {




  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int randomNumber = rand.nextInt(100) + 1;
    System.out.println("Random number is " + randomNumber);
    System.out.println("This application generates a random integer between 0 and 100 and asks the user to guess repeatedly until they guess correctly. \n");
    //System.out.println("Enter your next guess ");
    int tryCount = 1;
    int tooHigh = 100;
    int tooLow = 0;
    int playerGuess = 0;

    
    while(true) {
    	
      if (tryCount == 1) {
      	 System.out.println("Enter your first guess ");
         playerGuess = scanner.nextInt();
      }

      if (tryCount > 1) {
    	  System.out.println("Enter your next guess between " + tooLow + " and " + tooHigh);
          playerGuess = scanner.nextInt();
      }
      

      
      
      if (playerGuess == randomNumber) {
        System.out.println("Congratulations, you guessed correctly ");
        System.out.println("Try again? (yes or no) ");
        String inputchoice1 = scanner.nextLine();
        String inputchoice = scanner.nextLine();

    
        if (inputchoice.equals("y") || inputchoice.equals("yes")) {
        	tryCount = 1;
        	randomNumber = rand.nextInt(100) + 1;
        	continue;
            
        }
        else if (inputchoice.equals("n")  || inputchoice.equals("no")) {
        	break;
        	
        }
      }
      else if(randomNumber > playerGuess) {
        if (tryCount >= 7) {
        	  System.out.println("You have exceeded the maximum number of guesses, 7. Try again. ");
        	  break;
        }  
        tooLow = playerGuess;
        System.out.println("Your guess is too low");
        System.out.println("Number of guesses is: " + tryCount);
        
      }
      else {
        if (tryCount >= 7) {
        	System.out.println("You have exceeded the maximum number of guesses, 7. Try again. ");
        	break;
        }  
        tooHigh = playerGuess;
        System.out.println("Your guess is too high ");
        System.out.println("Number of guesses is: " + tryCount);
        
      }
      tryCount++;
    }
    
    scanner.close();
    
  }
}