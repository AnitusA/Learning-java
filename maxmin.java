import java.util.Scanner;

public class maxmin {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array must have at least one element.");
            scanner.close();
            return;
        }
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        
        scanner.close();
    }--
    
}
