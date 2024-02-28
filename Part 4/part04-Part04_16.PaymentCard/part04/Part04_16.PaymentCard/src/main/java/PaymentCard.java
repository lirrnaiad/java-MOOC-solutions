public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        this.balance -= 2.60;
        if (this.balance < 0) {
            this.balance += 2.60;
            return;
        }
    }

    public void eatHeartily() {
        this.balance -= 4.60;
        if (this.balance < 0) {
            this.balance += 4.60;
            return;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        if (balance >= 150) {
            this.balance = 150;
        }
    }
}