package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int cups, M, W, C;
        System.out.println("Enter W");
        W = in.nextInt() /200;
        System.out.println("Enter M");
        M = in.nextInt() / 50;
        System.out.println("Enter C");
        C = in.nextInt() / 15;
        System.out.println("Enter cups");
        cups = in.nextInt();

        int m_cups = Math.min(W, Math.min(M, C));
        if (cups == m_cups){
            System.out.println("Yes, i can doing " + cups + " cups");
        }
        else if (cups > m_cups){
            System.out.println("No, i can doing only " + m_cups);
        }
        else if (cups < m_cups){
            System.out.println("Yes, i can doing " + cups + " cups and " + (m_cups-cups));
        }
    }
}
