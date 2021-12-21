package CreditCalculator;

import java.util.Scanner;

public class CreditCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Loan principal: 1000\n" +
                "Month 1: repaid 250\n" +
                "Month 2: repaid 250\n" +
                "Month 3: repaid 500\n" +
                "The loan has been repaid!");

        System.out.println("payment:");
        int payment = in.nextInt();
        System.out.println("m/p");
        char m_p = in.next().charAt(0);
        if (m_p == 'm'){
            System.out.println("monthly payment: ");
            int principal = in.nextInt();
            if (payment%principal == 0) {
                System.out.println("You must paying for " + payment/principal);
            }
            else{
                System.out.println("You must paying for " + (payment/principal+1));
            }
        }
        else if (m_p == 'p'){
            System.out.println("months: ");
            int months = in.nextInt();
            if (payment%months == 0){
                System.out.println("principal = " + payment/months);
            }
            else {
                System.out.println("principal = " + payment/months + " but last month = " + (payment - payment/months*months));
            }

        }

    }
}
