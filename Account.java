public class Account {

    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: INR" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Withdrew: INR" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: INR" + this.balance);
    }


    public static void main(String[] args) {
        // Create an account with no initial balance
        Account account1 = new Account();
        account1.displayBalance(); // Should display 0
        account1.deposit(700); // Deposit 700
        account1.withdraw(70); // Withdraw 70
        account1.displayBalance(); // Should display 630

        // Create an account with an initial balance of 500
        Account account2 = new Account(500);
        account2.displayBalance(); // Should display 500
        account2.deposit(200); // Deposit 200
        account2.withdraw(100); // Withdraw 100
        account2.displayBalance(); // Should display 600
    }
}
