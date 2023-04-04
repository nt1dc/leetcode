package yandex_algoritm_training_3_0;

import java.util.*;
import java.util.stream.Collectors;

public class BeautifulString {
    // TODO: 2/23/2023 я не ебу но оно не работает)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> diegosStickers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            diegosStickers.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            p.add(scanner.nextInt());
        }
        List<Integer> diegosStickers1 = diegosStickers.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < p.size(); i++) {
            int l = 0;
            int r = diegosStickers1.size() - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (diegosStickers1.get(m) < p.get(i)) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            System.out.println(l);
        }

    }
}
