package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pole");
        String p = in.next();
        for (int i = 0; i < 9; i++) {
            System.out.print(p.charAt(i));
            if (i % 3 == 2) {
                System.out.println();
            }
        }
        if (p.charAt(0) == 'X' && p.charAt(2) == 'X' && p.charAt(1) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(3) == 'X' && p.charAt(4) == 'X' && p.charAt(5) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(6) == 'X' && p.charAt(7) == 'X' && p.charAt(8) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(0) == 'X' && p.charAt(3) == 'X' && p.charAt(6) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(1) == 'X' && p.charAt(4) == 'X' && p.charAt(7) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(2) == 'X' && p.charAt(5) == 'X' && p.charAt(8) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(0) == 'X' && p.charAt(4) == 'X' && p.charAt(8) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(2) == 'X' && p.charAt(4) == 'X' && p.charAt(6) == 'X') {
            System.out.println("WIN X");
        } else if (p.charAt(0) == 'O' && p.charAt(2) == 'O' && p.charAt(1) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(3) == 'O' && p.charAt(4) == 'O' && p.charAt(5) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(6) == 'O' && p.charAt(7) == 'O' && p.charAt(8) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(0) == 'O' && p.charAt(3) == 'O' && p.charAt(6) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(1) == 'O' && p.charAt(4) == 'O' && p.charAt(7) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(2) == 'O' && p.charAt(5) == 'O' && p.charAt(8) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(0) == 'O' && p.charAt(4) == 'O' && p.charAt(8) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(2) == 'O' && p.charAt(4) == 'O' && p.charAt(6) == 'O') {
            System.out.println("WIN O");
        } else if (p.charAt(0) == '_' || p.charAt(1) == '_' || p.charAt(2) == '_' || p.charAt(3) == '_' || p.charAt(4) == '_' || p.charAt(5) == '_' ||
                p.charAt(6) == '_' || p.charAt(7) == '_' || p.charAt(8) == '_') {
            System.out.println("Continue");
        } else {
            System.out.println("DRAW");
        }
    }
}
