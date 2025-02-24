public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor that requires all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Override display() method
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  Country: " + country);
        System.out.println("  Language: " + language);
        System.out.println();
    }
}
