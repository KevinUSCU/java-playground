public class BankAccount {

    private String name = "Default Account";
    private long balance = 0;

    public long balance() {
        return balance;
    }

    public boolean isOverDrawn() {
        return (balance < 0);
    }

    public void deposit(long cents) {
        balance += cents;
    }

    public void withdraw(long cents) {
        balance -= cents;
    }

}
