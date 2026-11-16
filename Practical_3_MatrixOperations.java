import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of Matrix A:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns of Matrix B:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (r1 == r2 && c1 == c2) {
            int[][] sum = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Matrix Addition Result:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition is not possible.");
        }

        if (c1 == r2) {
            int[][] mult = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        mult[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Matrix Multiplication Result:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mult[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }

        System.out.println("Transpose of Matrix A:");
        int[][] transA = new int[c1][r1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                transA[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                System.out.print(transA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Row-wise Sum of Matrix A:");
        for (int i = 0; i < r1; i++) {
            int rowSum = 0;
            for (int j = 0; j < c1; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("Column-wise Sum of Matrix A:");
        for (int j = 0; j < c1; j++) {
            int colSum = 0;
            for (int i = 0; i < r1; i++) {
                colSum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        sc.close();
    }
}
