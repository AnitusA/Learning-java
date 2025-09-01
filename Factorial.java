import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    
    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to factorialize");
        int number = sc.nextInt();

        BigInteger result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
        sc.close();


    }
}
