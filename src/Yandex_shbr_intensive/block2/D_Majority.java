package Yandex_shbr_intensive.block2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class D_Majority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] ints = new int[s];
        for (int i = 0; i < s; i++) {
            ints[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < ints.length; i++) {
            integerIntegerHashMap.put(ints[i], integerIntegerHashMap.getOrDefault(ints[i], 0) + 1);

            if (integerIntegerHashMap.get(ints[i]) > ints.length / 2) {
                System.out.println(ints[i]);
                return;
            }
        }
    }
}
