package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = in.next();
        for (int i = 0; i < 9; i++){
            System.out.print(p.charAt(i));
            if (i %3 ==2){
                System.out.println();
            }
        }
    }
}
