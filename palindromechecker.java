import java.util.Scanner;
public class palindromechecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word :");
        String word = sc.nextLine();
        word = word.toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();
        if(word.equals(reversed)){
            System.out.println("The given word is a palindrome word");
        }
        else{
            System.out.println("The given word is not an palindrome ");
        }
        sc.close();

    }
    
}
