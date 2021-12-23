import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enter2 = System.getProperty("type");
        String loan2 = System.getProperty("loan");
        String months2 = System.getProperty("months");
        String principal2 = System.getProperty("principal");
        String payment2 = System.getProperty("payment");
        char enter = ' ';
        double loan = 0;
        int months = 0;
        int payment = 0;
        int principal = 0;
        if (enter2 == null) {
            System.out.println("Incorrect parameters");
            System.exit(0);
        } else if (enter2.equals("a")) {
            if (loan2 == null) {
                System.out.println("Incorrect parameters");
                System.exit(0);
            } else {
                loan = Double.parseDouble(loan2);
                if (principal2 != null && months2 != null) {
                    enter = 'a';
                    principal = Integer.parseInt(principal2);
                    months = Integer.parseInt(months2);
                } else if (principal2 != null && payment2 != null) {
                    enter = 'n';
                    principal = Integer.parseInt(principal2);
                    payment = Integer.parseInt(payment2);
                } else if (payment2 != null && months2 != null) {
                    enter = 'p';
                    months = Integer.parseInt(months2);
                    payment = Integer.parseInt(payment2);
                } else {
                    System.out.println("Incorrect parameters");
                    System.exit(0);
                }
            }
        } else if (enter2.equals("d")) {
            if (loan2 == null) {
                System.out.println("Incorrect parameters");
                System.exit(0);
            } else {
                if (principal2 != null && months2 != null) {
                    enter = 'd';
                    principal = Integer.parseInt(principal2);
                    months = Integer.parseInt(months2);
                } else {
                    System.out.println("Incorrect parameters");
                    System.exit(0);
                }
            }
        }
        if (enter == 'a') {
            loan = loan / (12 * 100);
            System.out.println("You must paying per month:  " + (Math.ceil(principal * (loan * pow(1 + loan, months)) / (pow(1 + loan, months) - 1))));
        } else if (enter == 'n') {
            loan = loan / (12 * 100);
            System.out.print("You must paying for " + (Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan)) / 12) + " Years");
            if ((Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan))) % 12 > 0) {
                System.out.print(" and " + ((Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan))) -
                        (Math.ceil(log(payment / (payment - loan * principal)) / log(1 + loan)) / 12)) + " Months");
            }
        } else if (enter == 'p') {
            loan = loan / (12 * 100);
            System.out.println("Principal: " + (Math.ceil(payment / ((loan * pow(1 + loan, months)) / (pow(1 + loan, months) - 1)))));

        } else if (enter == 'd') {
            loan = loan / (12 * 100);
            double over = 0;
            for (int i = 1; i < months + 1; i++) {
                System.out.println("d = " + (Math.ceil(principal / months + loan * (principal - (principal * (i - 1)) / months))));
                over = over + (Math.ceil(principal / months + loan * (principal - (principal * (i - 1)) / months)) - (principal / months));
                if (i == months) {
                    System.out.println(over);
                }
            }
        }

    }
}
