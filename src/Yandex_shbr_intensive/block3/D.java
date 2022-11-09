package Yandex_shbr_intensive.block3;

import java.util.Scanner;

public class D {
    private static boolean check(int x, int[] coords, int k) {
        int cows = 1;
        int last_cow = coords[0];
        for (int c : coords) {
            if (c - last_cow >= x) {
                cows++;
                last_cow = c;
            }
        }
        return cows >= k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) {
            cows[i] = scanner.nextInt();
        }
        int l = 0;
        int r = cows[n - 1];
        while (r-l>1) {
            int m = (r + l) / 2;
            if (check(m, cows, k)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

}
