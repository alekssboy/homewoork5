import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double sum = 0;
        double[][] arraydm = new double[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arraydm[i][j] = Math.random() + num;
                System.out.print(arraydm[i][j] + " ");
                sum = sum + arraydm[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
