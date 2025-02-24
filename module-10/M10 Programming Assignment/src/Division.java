/*
 * Colton Kohler
 * 2/23/2025
 * M10 Assignment
 * Purpose: This program defines an abstract Division class to represent company divisions.
 *          It includes two subclasses: InternationalDivision (with country and language fields)
 *          and DomesticDivision (with a state field). The program demonstrates polymorphism
 *          by creating instances of both subclasses and displaying their details.
 */

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor that requires division name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented in subclasses
    public abstract void display();
}
