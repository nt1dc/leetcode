package Yandex_shbr_intensive.block1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_buy_and_sell {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] array = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minI = 0;
        long maxProfit = 0;
        long maxGas = 1000 / array[0];
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 1; i < array.length; i++) {
            if (maxGas * array[i] - 1000 > maxProfit) {
                maxProfit = maxGas * array[i] - 1000;
                ans1 = minI + 1;
                ans2 = i + 1;
            }
            if (1000 / array[i] > maxGas&& array[i]<=1000) {
                minI = i;
                maxGas = 1000 / array[i];
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
}
