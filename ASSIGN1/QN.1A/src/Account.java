public class Account
{
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        this.balance = this.balance + amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance! ");
        }
    }

    public String toString() {
        return "A/C no" + Integer.toString(this.accountNumber) + " balance = $" + Double.toString(this.balance);
    }
}

