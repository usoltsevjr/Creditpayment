public class CreditPaymentService {
    public int calculate (int amount, double percent, int year){
        int month = 12 * year;
        double rate = percent / 12 / 100;
        double rate1 = rate + 1;
        double a = pow(rate1, month);
        double coefficient = (rate * a)/(a - 1);
        double payment = amount * coefficient;
        return (int) payment;
    }

    public static double pow(double value, int powValue){
        double result = 1;
        for (int i =1; i <= powValue; i++){
            result = result * value;
        }
        return result;
    }
}
