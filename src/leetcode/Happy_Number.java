package leetcode;

import java.util.HashSet;

//202. Happy Number
//https://leetcode.com/problems/happy-number/
public class Happy_Number {
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> hs = new HashSet<Integer>();
            while(n != 1){
                hs.add(n);
                int x = 0;
                while(n != 0){
                    int rem = n % 10;
                    n = n /10;
                    x = x + (rem*rem);
                }
                if(hs.contains(x)){
                    return false;
                }
                n = x;
            }
            return true;
        }
    }
    public static void main(String[] args) {

    }
}
