package interview_prepare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;



public class Yandex2 {
    static class Person implements Comparable {
        String name;
        String job;
        int reshen;
        int shtraf;


        public Person(String string, String string1, String string2, String string3) {
            this.name = string;
            this.job = string1;
            this.reshen = Integer.parseInt(string2);
            this.shtraf = Integer.parseInt(string3);
        }

        @Override
        public int compareTo(Object o) {
            Person person = (Person) o;
            if (reshen > person.reshen) return -1;
            if (reshen < person.reshen) return 1;
            if (shtraf < person.shtraf) return -1;
            return 1;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            String[] name = br.readLine().split(",");
            hashMap.put(name[0], Integer.valueOf(name[1]));
        }
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] strings = br.readLine().split(",");
            priorityQueue.add(new Person(strings[0], strings[1], strings[2], strings[3]));
        }
        PriorityQueue<String> ans = new PriorityQueue<>();

        while (!priorityQueue.isEmpty()) {
            if (hashMap.isEmpty()) break;
            Person p = priorityQueue.poll();
            if (hashMap.containsKey(p.job)) {
                int count = hashMap.get(p.job);
                if (count > 0) {
                    ans.add(p.name);
                    if (count == 1) {
                        hashMap.remove(p.job);
                    } else {
                        hashMap.put(p.job, count - 1);
                    }
                }
            }
        }
        while (!ans.isEmpty()) {
            System.out.println(ans.poll());
        }

    }
}
