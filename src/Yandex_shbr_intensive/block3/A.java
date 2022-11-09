package Yandex_shbr_intensive.block3;

import java.util.*;

import static java.util.Arrays.*;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        sort(chars);
        sort(chars1);
        if(Arrays.equals(chars1, chars)) System.out.println("YES");
        else System.out.println("NO");
    }
}
