public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        System.out.println("Текущий остаток " + bankAccount.getAmount());
        bankAccount.deposit(15000.0);
        System.out.println("Текущий остаток " + bankAccount.getAmount());

        while (true) {
            try {
                bankAccount.withDraw(6000);
                System.out.println("Текущий остаток " + bankAccount.getAmount());
            }
            catch (LimitException ie) {
                System.out.println(ie.getMessage());
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                }
                catch (LimitException ex) {
                    Double remainingAmount = ie.getRemainingAmount();
                    remainingAmount = bankAccount.getAmount();
                    System.out.println("Вы сняли " + remainingAmount);
                    System.out.println("Текущий остаток " + bankAccount.getAmount());
                    break;
                }
            System.out.println("Текущий остаток " + bankAccount.getAmount());
            break;
            }
        }
    }
}