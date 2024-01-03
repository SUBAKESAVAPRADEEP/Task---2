package Pradeep;


    public class Account {
        private double balance;

        // No-argument constructor
        public Account() {
            balance = 0.0;
        }

        // Constructor with two arguments
        public Account(double initialBalance) {
            balance = initialBalance;
        }

        // Method to deposit the amount to the account
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }

        // Method to withdraw the amount from the account
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Amount withdrawn: " + amount);
            } else {

                System.out.println("Insufficient balance");
            }
        }

            // Method to display the balance
            public void displayBalance () {
                System.out.println("Balance: " + balance);
            }}