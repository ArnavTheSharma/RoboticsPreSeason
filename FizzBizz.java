public class FizzBizz{
    public static void main(String[] args) {
        
        for (int x = 1; x < 101; x++){
            if (x % 15 == 0){
                System.out.println("FizzBizz");
            }
            
            else if (x % 5 == 0){
                System.out.println("Buzz");
            }
            
            else if (x % 3 == 0){
                System.out.println("Fizz"); 
            }
            
          
            
            else if (31 < x && x < 38) {
                System.out.println("Fizz" + x%10);
            
            }
            
            else if (x % 10 == 3) {
                System.out.println(x/10 + "Fizz");
            }
            
            else{
                System.out.println(x);
                
            }
            }
            
        }
}
