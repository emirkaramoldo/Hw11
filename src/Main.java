public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount(0);
        System.out.println("Текущий остаток " + bankAccount.getAmount());
        bankAccount.deposit(15000.0);
        System.out.println("Текущий остаток " + bankAccount.getAmount());

        while (true) {
            try {
                bankAccount.withDraw(6000);
            }
            catch (LimitException ie) {
                System.out.println(ie.getMessage());
                Double remainingAmount = ie.getRemainingAmount();
                remainingAmount = bankAccount.getAmount();
                bankAccount.withDraw(remainingAmount);
                System.out.println("Вы сняли " + remainingAmount);
                System.out.println("Текущий остаток " + bankAccount.getAmount());
                break;
            }
        }
    }
}