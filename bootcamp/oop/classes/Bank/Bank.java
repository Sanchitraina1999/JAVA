public class Bank {
    private int balance = 0;

    public void addAmount(int amt) {
        this.balance += amt;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawFunds(int debt) {
        if (getBalance() > debt) {
            this.balance -= debt;
        } else {
            System.out.println("Insufficient Funds!");
        }
    }
}
