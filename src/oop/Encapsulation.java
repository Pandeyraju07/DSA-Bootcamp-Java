package oop;

/**
 * Encapsulation — bind data + methods, and HIDE internal data.
 *
 * How in Java:
 *   1. make fields private
 *   2. give public getters / setters (controlled access)
 *   3. validate inside setters
 *
 * Why interviewers like it:
 *   protects object from invalid data
 *   you can change internal code without breaking callers
 *
 * PROBLEM:
 *   BankAccount — cannot set negative balance / withdraw more than balance.
 *
 * Dry run:
 *   acc.deposit(1000) → balance=1000
 *   acc.withdraw(1200) → rejected
 *   acc.withdraw(400)  → balance=600
 */
public class Encapsulation {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Raju", 500);

        System.out.println("Owner: " + acc.getOwner());
        System.out.println("Start balance: " + acc.getBalance());

        acc.deposit(1000);
        acc.withdraw(1200); // should fail
        acc.withdraw(400);  // should work
        acc.setOwner("");   // invalid name rejected

        System.out.println("Final balance: " + acc.getBalance());
        System.out.println("Owner now: " + acc.getOwner());
    }
}

class BankAccount {
    private String owner;   // hidden
    private double balance; // hidden

    BankAccount(String owner, double balance) {
        setOwner(owner);
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // getters → read-only access from outside
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // setters / methods → controlled write
    public void setOwner(String owner) {
        if (owner == null || owner.isBlank()) {
            System.out.println("Invalid owner name");
            return;
        }
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ", balance=" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw must be positive");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ", balance=" + balance);
    }
}
