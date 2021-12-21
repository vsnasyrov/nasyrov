package MatrixProcessing;

import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int[] matrix = new int[a1*b1];
        for (int i = 0; i < a1*b1; i++){
            matrix[i] = in.nextInt();
        }
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int[] matrix2 = new int[a2*b2];
        for (int i = 0; i < a2*b2; i++){
            matrix2[i] = in.nextInt();
        }
        if (a1 == a2 && b1 == b2){
            for (int i = 0; i < a2*b2; i++){
                System.out.print((matrix[i] + matrix2[i]) + " ");
                if(i%b2 == (b2-1)){
                    System.out.println();
                }
            }
        }
        else{
            System.out.println("ERROR");
        }
    }
}
