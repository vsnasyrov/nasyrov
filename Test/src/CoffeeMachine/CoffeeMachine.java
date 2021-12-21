package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int cups;
        System.out.println("Enter cups");
        cups = in.nextInt();
        System.out.println("W = " + cups * 200 + "\n M = " + cups*50 + "\n C = " + cups*15);
    }
}
