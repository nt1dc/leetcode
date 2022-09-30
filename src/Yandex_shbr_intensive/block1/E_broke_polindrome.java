package Yandex_shbr_intensive.block1;

import java.util.Scanner;

public class E_broke_polindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 1) {
            System.out.println("");
            return;
        }
        boolean flag = false;
        String ans = null;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != 'a') {
                ans = s.substring(0, i) + "a" + s.substring(i + 1);
                flag = true;
                break;
            }
        }
        if (flag) System.out.println(ans);
        else System.out.println(s + "b");
    }
}

