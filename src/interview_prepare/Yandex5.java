//package interview_prepare;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.Stack;
//
//public class Yandex5 {
//    static class Pair {
//        Character key;
//        Integer val;
//
//        public Pair(char h, int i) {
//            key = h;
//            val = i;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
////         BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//
////        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//
//        Stack<Pair> pairStack = new Stack<>();
//        Queue<Pair> someShit = new ArrayDeque<>();
//
//        int i = -1;
//        while (reader.ready()) {
//            i++;
//            char h = (char) reader.read();
//            if(h=='='&& !pairStack.empty()) {
//                someShit.addAll(pairStack);
//                pairStack.clear();
//                if (someShit.size()>1)break;
//            }
//            if (!(h == '(' || h == ')')) continue;
//            if (pairStack.empty()) {
//                pairStack.push(new Pair(h, i));
//            } else {
//                if (pairStack.peek().key == '(' && h == ')') {
//                    pairStack.pop();
//                } else {
//                    pairStack.push(new Pair(h, i));
//                }
//            }
//        }
//
//        someShit.addAll(pairStack);
//
//        if (someShit.size() == 1) {
//            System.out.println(someShit.peek().val + 1);
//        } else System.out.println("-1");
//
//    }
//}