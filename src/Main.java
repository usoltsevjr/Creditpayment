public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();
        int payment = credit.calculate(1_000_000,9.99,1);
        System.out.println(payment);

        int payment2 = credit.calculate(1_000_000,9.99,2);
        System.out.println(payment2);

        int payment3 = credit.calculate(1_000_000,9.99,3);
        System.out.println(payment3);
    }
}
