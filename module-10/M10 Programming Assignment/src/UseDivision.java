public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision instances with new details
        InternationalDivision intlDiv1 = new InternationalDivision("South America Operations", 3056, "Brazil", "Portuguese");
        InternationalDivision intlDiv2 = new InternationalDivision("Middle East Expansion", 4123, "UAE", "Arabic");

        // Create two DomesticDivision instances with new details
        DomesticDivision domDiv1 = new DomesticDivision("Midwest Region", 5210, "Illinois");
        DomesticDivision domDiv2 = new DomesticDivision("Southern Region", 6387, "Georgia");

        // Display details for each division
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
