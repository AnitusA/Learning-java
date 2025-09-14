import java.util.Scanner;

public class Errorhandling {
    public static void main(String[] args) {
    
        String correctUsername = "admin";
        String correctPassword = "12345";

        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3 && !loggedIn) {
            try {
                System.out.print("Enter username: ");
                String username = sc.nextLine();

                System.out.print("Enter password: ");
                String password = sc.nextLine();

                // Error handling for empty input
                if (username.isEmpty() || password.isEmpty()) {
                    throw new IllegalArgumentException("Username or Password cannot be empty!");
                }

                // Check credentials
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful! Welcome, " + username);
                    loggedIn = true;
                } else {
                    attempts++;
                    System.out.println("Invalid credentials. Attempts left: " + (3 - attempts));
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Access blocked.");
        }

        sc.close();
    }
}
