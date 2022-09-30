package Yandex_shbr_intensive.block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_stairs_builder {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bufferedReader.readLine());
        Long zxc = Long.parseLong("zxc");

        System.out.println(zxc);

        double D = 1 - 8 * (-n);
        double x1 = (-1 + Math.sqrt(D)) / 2;
        if (D==0){
            System.out.println(-0.5);
            return;
        }
        System.out.println((int) Math.floor(x1));
    }
}
