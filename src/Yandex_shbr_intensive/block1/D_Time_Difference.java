package Yandex_shbr_intensive.block1;

import java.util.*;

public class D_Time_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String str : s
        ) {
            String[] split = str.split(":");
            list.add(Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]));
        }
        list.sort(Integer::compareTo);
        int min = 1440 + list.get(0) - list.get(list.size() - 1);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) < min) {
                min = list.get(i + 1) - list.get(i);
            }
        }
        System.out.println(min);
    }
}
