import java.util.Scanner;

public class Change{
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        boolean list = true;
        double total = 0;
        while (list = true) {
            double cost;
            System.out.println("Enter the cost of your item (type 0 if you are done with your list): ");
            cost = myObj.nextFloat();
            
            if (cost == 0) {
                list = false;
                break;
            }
            
            else {
                total+= cost;
            }
            
        }
        
        System.out.println("How much cash would you like to pay with?");
        double cash = myObj.nextDouble();   
        
        if (cash == total) {
            System.out.println("Thank you for shopping with us, you have no change");
        }
        
        else if (cash < total) {
            System.out.println("Sorry, you don't have enough money to buy these items");
        }
        
        else{
            System.out.println("Your change:");
            double[] db = {100, 50, 20, 10, 5, 2, 1}; //denominations of bills
            double[] dc = {0.25, 0.1, 0.05, 0.01}; //denominations of coins
            String[] coin = {"Quarter", "Dime", "Nickel", "Penny"};
            String[] coins = {"Quarters", "Dimes", "Nickels", "Pennies"};

            
            double diff = cash - total;
            for (int i = 0; i < db.length; i ++) { //bills change
            
               
                if (diff >= db[i]) {
                    int x = (int) (diff/db[i]);
                    double d = (double) x;
                    diff -= d * db[i];
                    if (x == 1) {
                        System.out.println("1 $" + db[i] + " bill");
                    }
                    else {
                        System.out.println(x + " $" + db[i] + " bills");

                    }
                }
            }
                if (diff != 0) {
                    for (int j = 0; j < dc.length; j ++) { //coins change
                        if (diff >= dc[j]) {
                            int y = (int) (diff/dc[j]);
                            diff -= y*dc[j];
                            if (y == 1) {
                                System.out.println("1 " + coin[j]);
                            }
                            else {
                                System.out.println(y + " " + coins[j]);
                            }
                            
                            }
                        
                    } 
            }
        
        }
        
        
        
    }
}
