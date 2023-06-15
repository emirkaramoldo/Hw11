public class LimitException extends Exception{
    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
}
