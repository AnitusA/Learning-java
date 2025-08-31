import java.util.Scanner;

public class Agechecker {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        if ( age < 15){
            System.out.println("You are a child");
        }
        else if ( age < 18){
            System.out.println("You are a teenager");
        }
        else if ( age < 30){
            System.out.println("You are a adult");
        }
        else if ( age < 60){
            System.out.println("You are a man");
        }
        else{
            System.out.println("You are a senior citizen");
        }
        sc.close();

    }
}
