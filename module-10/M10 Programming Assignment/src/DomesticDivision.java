public class DomesticDivision extends Division {
    private String state;

    // Constructor that requires all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Override display() method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  State: " + state);
        System.out.println();
    }
}
