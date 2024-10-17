public class Main {
    private double balance;

    // Constructor
    public Main(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current account balance
    public double accountBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        Main myAccount = new Main(100.00); // Initial balance of $100
        myAccount.deposit(50.00);
        myAccount.withdraw(30.00);
        System.out.println("Current balance: " + myAccount.accountBalance());
    }
}
