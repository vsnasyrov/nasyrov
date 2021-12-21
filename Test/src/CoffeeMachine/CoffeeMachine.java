package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int money = 550,cups = 9, M = 400, W = 540, C = 120;
        int min;
        do {

            System.out.println("What are you doing? buy/fill/take/remaining/exit");
            String a = in.next();
            if (a.equals("buy")){
                System.out.println("What you buy? Cappucino - 1, Late - 2, Espresso - 3");
                int number = in.nextInt();
                if (number == 1){
                    min = Math.min(W/200, Math.min(M/100, Math.min(C/12, cups)));
                    if (min == 0){
                        System.out.println("No ingredients");
                    }
                    else {
                        W -=200;M-=100;C-=12;cups-=1;money+=6;
                    }
                }
                if (number == 2){
                    min = Math.min(W/350, Math.min(M/75, Math.min(C/20, cups)));
                    if (min == 0){
                        System.out.println("No ingredients");
                    }
                    else {
                        W -=350;M-=75;C-=20;cups-=1;money+=7;
                    }
                }
                if (number == 3){
                    min = Math.min(W/250, Math.min(C/16, cups));
                    if (min == 0){
                        System.out.println("No ingredients");
                    }
                    else {
                        W -=250;C-=16;cups-=1;money+=4;
                    }
                }
            }
            else if (a.equals("fill")){
                System.out.println("Enter W, M, C, cups: ");
                W = in.nextInt() + W;M = in.nextInt() + M;C = in.nextInt() + C;cups = in.nextInt() + cups;
            }
            else if (a.equals("take")){
                money = 0;
            }
            else if (a.equals("remaining")){
                System.out.println("Money = " +  money + "\n cups = "+ cups + "\n M = " + M + "\n W = " + W + "\n C = " + C );
            }
            else if (a.equals("exit")){
                System.exit(0);
            }
        }while(true);
    }
}
