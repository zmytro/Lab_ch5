package lab_ch5_darvis;
//fig 5.6
public class Ex5_14_InterestModified {
    public static void main(String args[]) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.0500; // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int i = 0; i <= 5; i++) {
            for (int year = 1; year <= 10; year++) {
                // calculate new amount for specified year
                amount = principal * Math.pow(1.0 + rate, year);

                // display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            rate = rate + 0.0100;
            if(rate <=0.1) {System.out.printf("ставка = %.0f"+"%% \n",(rate*100));}
        }
    }
}
