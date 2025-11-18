// BankTransactionLimit.java
public class BankTransactionLimit {
    public static double remainingLimit(Double limit, double spent) {
        if (limit == null) return 0.0;
        return limit - spent;
    }

    public static void main(String[] args) {
        Double limit = 10000.0;
        System.out.println("Remaining Limit: " + remainingLimit(limit, 2500));
        System.out.println("For Null Limit: " + remainingLimit(null, 1000));
    }
}
