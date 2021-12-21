package hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Guest the word");
        String name = in.next();
        if (name.equals("java")){
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("YOU LOSE");
        }
    }
}
