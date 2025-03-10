/*
 * Name: Colton Kohler
 * Date: 3/9/2025
 * Assignment: M12 Programming Assignment
 *
 * Purpose: This program calculates the cost of a yearly auto service visit
 * using method overloading for different service scenarios.
 */

public class AutoService {
    // Base service cost
    private static final double BASE_COST = 120.0;
    private static final double OIL_FEE = 35.0;
    private static final double TIRE_FEE = 50.0;

    // yearlyService method overloads
    public static double yearlyService() {
        return BASE_COST;
    }

    public static double yearlyService(double oilFee) {
        return BASE_COST + oilFee;
    }

    public static double yearlyService(double oilFee, double tireFee) {
        return BASE_COST + oilFee + tireFee;
    }

    public static double yearlyService(double oilFee, double tireFee, double coupon) {
        return BASE_COST + oilFee + tireFee - coupon;
    }

    public static void main(String[] args) {
        // Test each method twice
        System.out.println("Standard Service: $" + yearlyService());
        System.out.println("Standard Service: $" + yearlyService());

        System.out.println("Service with Oil Change: $" + yearlyService(OIL_FEE));
        System.out.println("Service with Oil Change: $" + yearlyService(OIL_FEE));

        System.out.println("Service with Oil Change and Tire Rotation: $" + yearlyService(OIL_FEE, TIRE_FEE));
        System.out.println("Service with Oil Change and Tire Rotation: $" + yearlyService(OIL_FEE, TIRE_FEE));

        System.out.println("Service with Oil Change, Tire Rotation, and Discount: $" + yearlyService(OIL_FEE, TIRE_FEE, 25.0));
        System.out.println("Service with Oil Change, Tire Rotation, and Discount: $" + yearlyService(OIL_FEE, TIRE_FEE, 25.0));
    }
}
