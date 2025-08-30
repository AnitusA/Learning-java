import java.util.Scanner;

public class Multiplicaiontable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table digit:");
        int num = sc.nextInt();
        System.out.print("Enter how much series you want : ");
        int z = sc.nextInt();
        for (int i = 1; i <= z; i++){
            System.out.println( i +  " x " + num + " = " + (num*i));
        }
    }
}
