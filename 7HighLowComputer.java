import java.util.Scanner;
public class HighLowGame {
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);
        
        int high = 100;
        int low = 1;
        int guess = 50;
        int guesses = 1;
        while (true) {
            System.out.println("My guess is " + guess);
            String input = myObj.nextLine();
            System.out.println("Type h for too high, l for too low or w if it's right: ");
            if (input.equals("h")) {
                guess -= ((guess - low)/2);
                high = guess;
                guesses += 1;
            }
            
            else if (input.equals("l")) {
                guess += ((high - guess)/2);
                low = guess;
                guesses += 1;
            }

            else if (input.equals("w")) {
                System.out.println("Aha! Your number was " + guess + "... it took " + guesses + " tries");
                break;
            }
                
            
            
        }

    }
}
