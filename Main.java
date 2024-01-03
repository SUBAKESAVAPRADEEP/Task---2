package Pradeep;

public class Main {



    public static void main(String[] args) {
        // Creating an account with no initial balance
        Account account1 = new Account();

        // Deposit an amount
        account1.deposit(1000.0);

        // Display the balance
        account1.displayBalance();

        // Withdraw an amount
        account1.withdraw(500.0);

        // Display the balance
        account1.displayBalance();

        // Creating an account with an initial balance of 2000.0
        Account account2 = new Account(2000.0);

    }}
