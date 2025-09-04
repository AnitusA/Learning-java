import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGroceryList {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to Grocery List Manager!");
        while (true) {
            System.out.println("\nOptions: add / view / exit");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("add")) {
                System.out.print("Enter item name: ");
                String item = scanner.nextLine();
                groceryList.add(item);
                System.out.println(item + " added.");
            } else if (input.equals("view")) {
                System.out.println("\nYour Grocery List:");
                for (String item : groceryList) {
                    System.out.println("- " + item);
                }
            } else if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
