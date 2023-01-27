public class MultiplicationTable {
    public static void main(String[] args) {
      
        for (int x = 1; x < 13; x+=1) {    
            System.out.print("\t" + x);
        }
        
        for (int j = 1; j<13; j+=1) {
            System.out.print("\n"+j+"\t");
            
            
            for (int i = 1; i<13; i+=1) {
                System.out.print(j*i + "\t");
            }
               
               
        }
    }
}
