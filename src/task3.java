import java.util.Scanner;

public class task3 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] A = new int[n][m];
    for (int i = 0; i < A.length; i++) {
        if (i % 2 == 0) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = num;
                num++;
            }
        } else {
            for (int j = A[0].length - 1; j >= 0; j--) {
                A[i][j] = num;
                num++;
            }
        }
    }
    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A[0].length; j++) {
            if (A[i][j] <= 9) {
                System.out.print("  " + A[i][j]);
            } else if (A[i][j] <= 99) {
                System.out.print(" " + A[i][j]);
            } else if (A[i][j] <= 999) {
                System.out.print(A[i][j]);
            } else if (A[i][j] > 999) {
                System.out.print("out of boundary");
            }
        }
        System.out.println();
    }
//

}
}

