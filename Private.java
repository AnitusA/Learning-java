class Bankaccount {
    private String accountHolder;
    private double balance;

    public Bankaccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
public class Private{
     public static void main(String[] args) {
        Bankaccount myAccount = new Bankaccount("Anitus", 5000);
        System.out.println("Account holder: " + myAccount.getAccountHolder());
        myAccount.showBalance();

        myAccount.deposit(1500.0);
        myAccount.withdraw(2000.0);
        myAccount.showBalance();
     }
}