package yandex_algoritm_training_3_0;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Histogram {
    public static void main(String[] arg) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            for (char c : s.toCharArray()) {
                if (c != ' ' && c != '\n') {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                    max = Math.max(map.get(c), max);
                }
            }

        }
        List<Character> characters = map.keySet().stream().sorted().collect(Collectors.toList());
        StringBuilder builder = new StringBuilder();
        for (int i = max; i > 0; i--) {
            for (Character c : characters) {
                if (i > map.get(c)) {
                    builder.append(' ');
                } else {
                    builder.append('#');
                }
            }
            System.out.println(builder);
            builder.setLength(0);
        }
        for (Character c : characters
        ) {
            builder.append(c);
        }
        System.out.println(builder);
    }
}
