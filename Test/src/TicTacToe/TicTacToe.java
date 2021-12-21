package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pole");
        String p = "_________";
        char[] p2 = new char[9];
        for (int i = 0; i < 9; i++) {
            p2[i] = p.charAt(i);
            System.out.print(p.charAt(i));
            if (i % 3 == 2) {
                System.out.println();
            }
        }
        int true_coord = 0;
        boolean player = true;
        do {
            do {
                System.out.println("Enter coordinates");
                int coord1 = in.nextInt();
                int coord2 = in.nextInt();
                if (coord1 < 4 && coord1 > 0) {
                    if (coord2 < 4 && coord2 > 0) {
                        if (coord1 == 1 && coord2 == 1) {
                            true_coord = 0;
                        } else if (coord1 == 1 && coord2 == 2) {
                            true_coord = 1;
                        } else if (coord1 == 1 && coord2 == 3) {
                            true_coord = 2;
                        } else if (coord1 == 2 && coord2 == 1) {
                            true_coord = 3;
                        } else if (coord1 == 2 && coord2 == 2) {
                            true_coord = 4;
                        } else if (coord1 == 2 && coord2 == 3) {
                            true_coord = 5;
                        } else if (coord1 == 3 && coord2 == 1) {
                            true_coord = 6;
                        } else if (coord1 == 3 && coord2 == 2) {
                            true_coord = 7;
                        } else if (coord1 == 3 && coord2 == 3) {
                            true_coord = 8;
                        }
                        if (player == true) {
                            p2[true_coord] = 'X';
                            player = false;
                            break;
                        }
                        else if (player == false){
                            p2[true_coord] = 'O';
                            player = true;
                            break;
                        }
                    } else {
                        System.out.println(" pls enter 1 to 3");
                    }
                } else {
                    System.out.println(" pls enter 1 to 3");
                }
            } while (true);
            if (p2[0] == 'X' && p2[2] == 'X' && p2[1] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[3] == 'X' && p2[4] == 'X' && p2[5] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[6] == 'X' && p2[7] == 'X' && p2[8] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[0] == 'X' && p2[3] == 'X' && p2[6] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[1] == 'X' && p2[4] == 'X' && p2[7] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[2] == 'X' && p2[5] == 'X' && p2[8] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[0] == 'X' && p2[4] == 'X' && p2[8] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[2] == 'X' && p2[4] == 'X' && p2[6] == 'X') {
                System.out.println("WIN X");
                break;
            } else if (p2[0] == 'O' && p2[2] == 'O' && p2[1] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[3] == 'O' && p2[4] == 'O' && p2[5] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[6] == 'O' && p2[7] == 'O' && p2[8] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[0] == 'O' && p2[3] == 'O' && p2[6] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[1] == 'O' && p2[4] == 'O' && p2[7] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[2] == 'O' && p2[5] == 'O' && p2[8] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[0] == 'O' && p2[4] == 'O' && p2[8] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[2] == 'O' && p2[4] == 'O' && p2[6] == 'O') {
                System.out.println("WIN O");
                break;
            } else if (p2[0] == '_' || p2[1] == '_' || p2[2] == '_' || p2[3] == '_' || p2[4] == '_' || p2[5] == '_' ||
                    p2[6] == '_' || p2[7] == '_' || p2[8] == '_') {
                System.out.println("Continue");
            } else {
                System.out.println("DRAW");
                break;
            }
            for (int i = 0; i < 9; i++) {
                System.out.print(p2[i]);
                if (i % 3 == 2) {
                    System.out.println();
                }
            }
        } while (true);
        for (int i = 0; i < 9; i++) {
            System.out.print(p2[i]);
            if (i % 3 == 2) {
                System.out.println();
            }
        }
    }
}
