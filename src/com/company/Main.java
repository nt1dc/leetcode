package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("zxc.txt"));
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            stringList1.add(scanner.nextLine());
        }
        int n2 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n2; i++) {
            stringList2.add(scanner.nextLine());
        }
        for (String str : stringList1
        ) {
            Arrays.stream(str.split(" ")).forEach(s -> {
                for (String st : stringList2
                ) {
                    Arrays.stream(st.split(" ")).forEach(s1 ->
                    {
                        if (s1.equals(s)) {
                            map.put(str, st);
                        } else {
                            if (!map.containsKey(str)) {
                                map.put(str, "?");
                            }
                        }
                    });
                }
            });
        }
        for (String key : map.keySet()
        ) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
