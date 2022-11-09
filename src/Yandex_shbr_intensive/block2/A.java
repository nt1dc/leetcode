package Yandex_shbr_intensive.block2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Set<Integer> integerSet = new HashSet<>();
        for (int j = 0; j < i; j++) {
            integerSet.add(scanner.nextInt());
        }

        Set<Integer> zcx = new HashSet<>();
        int i1 = scanner.nextInt();
        for (int j = 0; j < i1; j++) {
            int i2 = scanner.nextInt();
            if (integerSet.contains(i2)) set.add(i2);
            else zcx.add(i2);
        }
        zcx.addAll(integerSet);
        int i3 = scanner.nextInt();
        for (int j = 0; j < i3; j++) {
            int i2 = scanner.nextInt();
            if (zcx.contains(i2)) set.add(i2);
        }
        set.stream().sorted().forEach(p-> System.out.print(p+" "));


    }
}
