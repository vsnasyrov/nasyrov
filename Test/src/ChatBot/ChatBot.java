package ChatBot;

import java.util.Scanner;

public class ChatBot {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Hello! My name is Alisa.\n" +
                    "I was created in 2021.\n" +
                    "Please, remind me your name.");
            String name = in.next();
            System.out.println("What a great name you have, " + name + "\nLet me guess your age.\n" +
                    "Enter remainders of dividing your age by 3, 5 and 7.");
            int remainder3 = in.nextInt();
            int remainder5 = in.nextInt();
            int remainder7 = in.nextInt();
            int remainder = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
            System.out.println("Your age is " + remainder + " that&#39;s a good time to start programming!");
        }
}
