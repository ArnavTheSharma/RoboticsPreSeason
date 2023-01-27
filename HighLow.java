import java.util.Scanner;
public class HighLowGame {
    public static void main(String[] args) {
        
        int tries = 1;
        int num = (int)(Math.random() * 101);
        System.out.println("psst.. the Secret number is " + num);

        while (true) {
            
            Scanner myObj = new Scanner(System.in);
            System.out.println("Input your guess: ");
            int guess = myObj.nextInt();
            
            if (guess > num) {
                System.out.println("Too high");
                tries += 1;
            }
            
            if (guess < num) {
                System.out.println("Too low");
                tries += 1;
            }
            
            if (guess == num) {
                System.out.println("You got it! It took " + tries + " tries");
                break;
            
            }
     
        }
        
    }
}
