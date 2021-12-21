package CreditCalculator;

import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Loan principal: 1000\n" +
                "Month 1: repaid 250\n" +
                "Month 2: repaid 250\n" +
                "Month 3: repaid 500\n" +
                "The loan has been repaid!");
        System.out.println("a/n/p/d?");
        String enter = in.next();
        if (enter.charAt(0) == 'a') {
            System.out.println("Loan: ");
            double loan = in.nextDouble();
            loan = loan / (12 * 100);
            System.out.println("months: ");
            int months = in.nextInt();
            System.out.println("principal: ");
            int principal = in.nextInt();
            System.out.println("You must paying per month:  " + (Math.ceil(principal * (loan * pow(1 + loan, months)) / (pow(1 + loan, months) - 1))));
        } else if (enter.charAt(0) == 'n') {
            System.out.println("Loan: ");
            double loan = in.nextDouble();
            loan = loan / (12 * 100);
            System.out.println("payment:");
            int payment = in.nextInt();
            System.out.println("principal: ");
            int principal = in.nextInt();
            System.out.print("You must paying for " + (Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan)) / 12) + " Years");
            if ((Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan))) % 12 > 0) {
                System.out.print(" and " + ((Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan))) -
                        (Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan)) / 12)) + " Months");
            }
        } else if (enter.charAt(0) == 'p') {
            System.out.println("Loan: ");
            double loan = in.nextDouble();
            loan = loan / (12 * 100);
            System.out.println("payment:");
            int payment = in.nextInt();
            System.out.println("months: ");
            int months = in.nextInt();
            System.out.println("Principal: " + (Math.ceil(payment / ((loan * pow(1 + loan, months)) / (pow(1 + loan, months) - 1)))));

        } else if (enter.charAt(0) == 'd') {
            double over = 0;
            System.out.println("Loan: ");
            double loan = in.nextDouble();
            loan = loan / (12 * 100);
            System.out.println("principal: ");
            int principal = in.nextInt();
            System.out.println("months: ");
            int months = in.nextInt();
            for (int i = 1; i < months + 1; i++) {
                System.out.println("d = " + (Math.ceil(principal / months + loan * (principal - (principal * (i - 1)) / months))));
                over = over + (Math.ceil(principal / months + loan * (principal - (principal * (i - 1)) / months)) - (principal / months));
                if (i == months) {
                    System.out.println(over);
                }
            }
        } else {
            System.out.println("Pls take a/n/p/d");
        }

    }
}
