package Yandex_shbr_intensive.block3;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        int[] positives = new int[n + 1];
        positives[0] = 0;
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
            if (ints[i] <= 0) {
                positives[i + 1] = positives[i];
            } else {
                positives[i + 1] = positives[i] + 1;
            }
        }
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(positives[r] - positives[l-1]);
        }
    }
}
