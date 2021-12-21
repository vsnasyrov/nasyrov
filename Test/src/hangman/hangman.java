package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.random;

public class hangman {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<String> word = new ArrayList<String>();
        word.add("java");
        word.add("kotlin");
        word.add("python");
        word.add("javascript");
        int min = 0;
        int max = 3;
        char name2;
        int endgame = 0;
        char[] all = new char[32];
        int all_test = 0;
        int rand = min + (int) (random() * (max-1+min));
        String final_word = word.get(rand);
        int number = 0;
        int change;
        char[] name = new char[final_word.length()];
        for (int i = 0; i < final_word.length(); i++){
            name[i] = '-';
        }
        for (int i = 0; i < 8; i++) {
            endgame = 0;
            change = 0;
            all_test = 0;
            System.out.println("\nGuest the word ");
            name2 = in.next().charAt(0);
            for (int i1 = 0; i1 < final_word.length(); i1++){
                if (name2 == final_word.charAt(i1)){
                    if (name[i1] == name2){
                        System.out.print("You've already guessed this letter.\n");
                    }
                    name[i1] = name2;
                    i--;
                    change++;
                }

                System.out.print(name[i1]);
                if (name[i1] != '-'){
                    endgame++;
                }
            }
            if (change == 0) {
                for (int i2 = 0; i2 < 32; i2++) {
                    if (all[i2] == name2) {
                        all_test++;
                    }
                }
                if (all_test > 0) {
                    System.out.println("\nYou've already guessed this letter.");
                } else {
                    System.out.println("\nThat letter doesn't appear in the word");
                    all[number] = name2;
                    number++;
                }
            }
            if (endgame == final_word.length()) {
                System.out.println("\nYOU WIN");
                System.exit(0);
            }
        }
        System.out.println("\nYOU LOSE");
        System.exit(0);
    }
}
