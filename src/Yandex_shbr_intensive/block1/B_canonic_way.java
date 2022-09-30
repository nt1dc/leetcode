package Yandex_shbr_intensive.block1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B_canonic_way {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String absolutePath = scanner.nextLine();
        String[] pathWithoutRepeatableSlash = absolutePath.split("[/]+");
        Deque<String> deque = new ArrayDeque<>();
        for (String folder : pathWithoutRepeatableSlash) {
            if (folder.isEmpty()) {
                continue;
            }
            if (folder.equals(".")) {
                continue;
            } else if (folder.equals("..")) {
                if (deque.size() > 0) {
                    deque.pop();
                }
            } else {
                deque.push(folder);
            }
        }
        StringBuilder answer = new StringBuilder("/");
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            answer.append(deque.removeLast());
            if (deque.size() != 0) {
                answer.append("/");
            }
        }

        System.out.println(answer);
    }
}
