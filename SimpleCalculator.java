import java.util.Scanner;

public class SimpleCalculator{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the operation symbols (+, -, *, / ) ");
        String symbol = sc.next();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        if( symbol.equals("+")){

            System.out.println( num1 + "+" + num2 + "=" + (num1+num2));
        }else if( symbol.equals("-")){

            System.out.println( num1 + "-" + num2 + "=" + (num1-num2));
        }else if( symbol.equals("*")){

            System.out.println( num1 + "*" + num2 + "=" + (num1*num2));
        }else if( symbol.equals("/")){

            if(num2 != 0){

                System.out.println( num1 + "/" + num2 + "=" + (num1/num2));
            }else{

                System.out.println("Error: Division by zero!");
            }

        }else{

            System.out.println("Invalid operator!");
        }
        sc.close();

    }
    

    

}
