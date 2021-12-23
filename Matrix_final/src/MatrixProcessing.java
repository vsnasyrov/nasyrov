import java.util.Scanner;

public class MatrixProcessing {
    private static double d = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("+/c/*/T/d(determ)/i(inverse)/e(exit)?");
            char what = in.next().charAt(0);
            if (what == 'e'){
                System.exit(0);
            }
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            int[] matrix = new int[a1 * b1];
            for (int i = 0; i < a1 * b1; i++) {
                matrix[i] = in.nextInt();
            }
            int c = 0;

            double[][] matrix2 = new double[a1][b1];
            for (int i = 0; i < a1; i++) {
                for (int i1 = 0; i1 < b1; i1++) {
                    matrix2[i][i1] = matrix[c];
                    c++;
                }
            }
            c = 0;
            if (what == 'c') {
                System.out.println("Const: ");
                int q = in.nextInt();
                for (int i = 0; i < a1 * b1; i++) {
                    System.out.print(matrix[i] * q + " ");
                    if (i % b1 == (b1 - 1)) {
                        System.out.println();
                    }
                }
            } else if (what == '+') {
                int a2 = in.nextInt();
                int b2 = in.nextInt();
                int[] matrix3 = new int[a2 * b2];
                for (int i = 0; i < a2 * b2; i++) {
                    matrix3[i] = in.nextInt();
                }
                if (a1 == a2 && b1 == b2) {
                    for (int i = 0; i < a2 * b2; i++) {
                        System.out.print((matrix[i] + matrix3[i]) + " ");
                        if (i % b2 == (b2 - 1)) {
                            System.out.println();
                        }
                    }
                }
            } else if (what == '*') {

                int a2 = in.nextInt();
                int b2 = in.nextInt();
                int[][] matrix3 = new int[a2][b2];
                for (int i = 0; i < a2; i++) {
                    for (int i1 = 0; i1 < b2; i1++)
                        matrix3[i][i1] = in.nextInt();
                }
                if (b1 == a2) {
                    double[][] matrix4 = new double[a1][b2];
                    for (int i = 0; i < a1; i++) {
                        for (int i1 = 0; i1 < b2; i1++)
                            matrix3[i][i1] = 0;
                    }
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
            else if (what == 'T'){

                System.out.println("Main diagonal (m)\n" +
                        "Side diagonal(s)\n" +
                        "Vertical line(v)\n" +
                        "Horizontal line(h)");
                char type = in.next().charAt(0);
                if (type == 'm'){
                    double[][] matrix3 = new double[b1][a1];

                    for (int i = 0; i < b1; i++) {
                        for (int i1 = 0; i1 < a1; i1++) {
                            matrix3[i][i1] = matrix2[i1][i];
                            System.out.print(matrix3[i][i1] + " ");
                        }
                        System.out.println();
                    }
                }else if(type == 's'){
                    double[][] matrix3 = new double[b1][a1];
                        int c2 = 1;
                        int c3 =1;
                    for (int i = 0; i < b1; i++) {
                        for (int i1 = 0; i1 < a1; i1++) {

                            matrix3[i][i1] = matrix2[b1-c3][a1-c2];
                            System.out.print(matrix3[i][i1] + " ");
                            c2++;
                        }
                        c3++;
                        c2 = 1;
                        System.out.println();
                    }

                }else if(type == 'v'){
                    double[][] matrix3 = new double[a1][b1];
                    int c2 = 1;
                    for (int i = 0; i < a1; i++) {
                        for (int i1 = 0; i1 < b1; i1++) {

                            matrix3[i][i1] = matrix2[i][b1-c2];
                            System.out.print(matrix3[i][i1] + " ");
                            c2++;
                        }
                        c2 = 1;
                        System.out.println();
                    }

                }else if(type == 'h'){
                    double[][] matrix3 = new double[a1][b1];
                    int c3 =1;
                    for (int i = 0; i < a1; i++) {
                        for (int i1 = 0; i1 < b1; i1++) {

                            matrix3[i][i1] = matrix2[a1-c3][i1];
                            System.out.print(matrix3[i][i1] + " ");
                        }
                        c3++;
                        System.out.println();
                    }

                }
            }
            else if (what == 'd'){
                if (a1 == b1){
                    int m = 1;
                    d(matrix2, m);
                    System.out.println("Determinant = " + d);
                }
                else{
                    System.out.println("ERROR");
                }
            }
            else if (what == 'i') {
                if (a1 == b1) {
                    double t;
                    int l = a1;

                    double[][] matrix4 = new double[l][l];

                    for (int i = 0; i < l; i++)
                        for (int i1 = 0; i1 < l; i1++) {
                            matrix4[i][i1] = 0;

                            if (i == i1)
                                matrix4[i][i1] = 1;
                        }

                    for (int i2 = 0; i2 < l; i2++) {
                        t = matrix2[i2][i2];

                        for (int i3 = 0; i3 < l; i3++) {
                            matrix2[i2][i3] /= t;
                            matrix4[i2][i3] /= t;
                        }

                        for (int i = i2 + 1; i < l; i++) {
                            t = matrix2[i][i2];

                            for (int i1 = 0; i1 < l; i1++) {
                                matrix2[i][i1] -= matrix2[i2][i1] * t;
                                matrix4[i][i2] -= matrix4[i2][i1] * t;
                            }
                        }
                    }

                    for (int i2 = l - 1; i2 > 0; i2--) {
                        for (int i = i2 - 1; i >= 0; i--) {
                            t = matrix2[i][i2];

                            for (int i1 = 0; i1 < l; i1++) {
                                matrix2[i][i1] -= matrix2[i2][i1] * t;
                                matrix4[i][i1] -= matrix4[i2][i1] * t;
                            }
                        }
                    }

                    for (int i = 0; i < l; i++)
                        for (int i1 = 0; i1 < l; i1++)
                            matrix2[i][i1] = matrix4[i][i1];


                }
            }
            else {
                System.out.println("ERROR");
            }

        } while(true);
    }
    public static void d (double[][] matrix2, double m){
        if (matrix2.length > 1){
            double [][] matrix3 = new double[matrix2.length - 1][matrix2[0].length - 1];
            for (int i = 0; i < matrix2[0].length; i++) {
                for (int i1 = 1; i1 < matrix2.length; i1++) {
                    for (int i2 = 0; i2 < matrix2[0].length; i2++) {
                        if (i2 < i)
                            matrix3[i1 - 1][i2] = matrix2[i1][i2];
                        else if (i2 > i)
                            matrix3[i1 - 1][i2 - 1] = matrix2[i1][i2];
                    }
                }
                double n_m = Math.pow(-1, i + 2) * matrix2[0][i] * m;
                d(matrix3, n_m);
            }
        }
        else
            d += m * matrix2[0][0];
    }
}
