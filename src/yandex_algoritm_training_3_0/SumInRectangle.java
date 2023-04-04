package yandex_algoritm_training_3_0;

import java.util.Arrays;
import java.util.Scanner;

public class SumInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] maxtrix = new int[n][m];
        int[][] matrixSum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxtrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
        }

        System.out.println(Arrays.deepToString(maxtrix));
    }
}
