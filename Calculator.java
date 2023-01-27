import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First integer?");
        int x = scan.nextInt();
        
        System.out.println("Second integer?");
        int y = scan.nextInt();
        
        
        Scanner myObj = new Scanner(System.in);
        String op;
        System.out.println("Operation? Either: +, -, *, / ");
        op = myObj.nextLine();

        switch (op) {
            case "+":
            System.out.println(x + y);
            break;
            
            case "-":
            System.out.println(x - y);
            break;
            
            case "*":
            System.out.println(x * y);
            break;
            
            case "/":
            System.out.println(x / (double) y);
            break;
        }
        
        
    }
}
