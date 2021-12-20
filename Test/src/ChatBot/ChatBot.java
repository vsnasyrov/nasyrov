package ChatBot;

import java.util.Scanner;

public class ChatBot {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Hello! My name is Alisa.\n" +
                    "I was created in 2021.\n" +
                    "Please, remind me your name.");
            String name = in.next();
            System.out.println("What a great name you have, " + name);
        }
}
