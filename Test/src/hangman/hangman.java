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

        int rand = min + (int) (random() * (max-1+min));
        String final_word = word.get(rand);
        System.out.println("Guest the word");
        String name = in.next();
        if (name.equals(final_word)){
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("YOU LOSE");
        }
    }
}
