public class BankAccount {
    private double amount;
    public double getAmount() {
        return  amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public BankAccount(double amount) {
        this.amount = amount;
    }
    public void deposit(double sum){
        setAmount(amount + sum);
    }
    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств. Будет снят остаток", amount);
        }
        setAmount(amount - sum);
    }
}
