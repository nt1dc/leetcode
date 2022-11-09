package Yandex_shbr_intensive.block2;

import java.util.HashMap;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int i1 = scanner.nextInt();
            if (integerIntegerHashMap.containsKey(i1)) {
                if (i - integerIntegerHashMap.get(i1) <= k) {
                    System.out.println("YES");
                    return;
                }
            }
            integerIntegerHashMap.put(i1, i);
        }
        System.out.println("NO");
    }
}
