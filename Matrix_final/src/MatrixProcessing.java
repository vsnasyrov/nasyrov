import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("+/c/*/e (exit)?");
            char what = in.next().charAt(0);
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            int[] matrix = new int[a1 * b1];
            for (int i = 0; i < a1 * b1; i++) {
                matrix[i] = in.nextInt();
            }
            if (what == 'c') {
                System.out.println("Const: ");
                int c = in.nextInt();
                for (int i = 0; i < a1 * b1; i++) {
                    System.out.print(matrix[i] * c + " ");
                    if (i % b1 == (b1 - 1)) {
                        System.out.println();
                    }
                }
            } else if (what == '+') {
                int a2 = in.nextInt();
                int b2 = in.nextInt();
                int[] matrix2 = new int[a2 * b2];
                for (int i = 0; i < a2 * b2; i++) {
                    matrix2[i] = in.nextInt();
                }
                if (a1 == a2 && b1 == b2) {
                    for (int i = 0; i < a2 * b2; i++) {
                        System.out.print((matrix[i] + matrix2[i]) + " ");
                        if (i % b2 == (b2 - 1)) {
                            System.out.println();
                        }
                    }
                }
            } else if (what == '*') {
                int c = 0;
                int[][] matrix2 = new int[a1][b1];
                for (int i = 0; i < a1; i++) {
                    for (int i1 = 0; i1 < b1; i1++) {
                        matrix2[i][i1] = matrix[c];
                        c++;
                    }
                }
                int a2 = in.nextInt();
                int b2 = in.nextInt();
                int[][] matrix3 = new int[a2][b2];
                for (int i = 0; i < a2; i++) {
                    for (int i1 = 0; i1 < b2; i1++)
                        matrix3[i][i1] = in.nextInt();
                }
                if (b1 == a2) {
                    int[][] matrix4 = new int[a1][b2];
                    for (int i = 0; i < a1; i++) {
                        for (int i1 = 0; i1 < b2; i1++) {
                            for (int i2 = 0; i2 < b1; i2++) {
                                matrix4[i][i1] = matrix4[i][i1] + matrix2[i][i2] * matrix3[i2][i];
                            }
                            System.out.print(matrix4[i][i1] + " ");
                        }
                        System.out.println();

                    }
                } else {
                    System.out.println("ERROR");
                }
            }
        } while(true);
    }
}
