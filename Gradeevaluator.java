import java.util.Scanner;

public class Gradeevaluator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int avg = 0;
        System.out.println("Enter your marks of 5 subject =");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            avg = avg + marks[i];
        }
        int percentage = avg/5;
        if(percentage > 80){
            System.out.println("Grade : A");
        }
        else if(percentage >60){
            System.out.println("Grade : B");
        }
        else if(percentage >40){
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Grade : D");
        }
    }
}
