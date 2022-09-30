package interview_prepare;

import java.util.HashSet;
import java.util.Set;

public class Polidrom {
    public static class Solution {
        boolean validate(String s, FuncInterface funcInterface) {
            int r = s.length() - 1;
            int l = 0;
            while (l < r) {
                while (funcInterface.spec(s.charAt(l))) l++;
                while (funcInterface.spec(s.charAt(r))) r--;
                if (s.charAt(l) != s.charAt(r)) return false;
                l++;
                r--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Set<Character> characters = new HashSet<>();
        characters.add('!');
        characters.add('*');
        System.out.println(solution.validate("zxz", x -> characters.contains(x)));
    }
}
