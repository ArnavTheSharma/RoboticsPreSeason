import java.math.BigInteger;
public class Factorials {
    public static void main(String[] args) {
        BigInteger y = new BigInteger("1");
        for (int x = 1; x < 101; x++) {
            y = y.multiply(BigInteger.valueOf(x));
            System.out.println(x + "! = " + y);
        }
    }
}
