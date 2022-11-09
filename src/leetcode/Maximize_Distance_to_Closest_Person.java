package leetcode;

public class Maximize_Distance_to_Closest_Person {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int maxDist = 0;
            int start = 0;
            int end = 0;
            while (end < seats.length) {
                maxDist = Math.max(maxDist, end - start);
                if ((seats[end] == 1 && start == 0 && seats[start] == 0) || (seats[end] == 0 && end == seats.length - 1)) {
                    maxDist = Math.max(maxDist, end - start);
                } else if (seats[end] == 1) {
                    maxDist = Math.max(maxDist, (end - start)/2);
                    start = end;
                }
                end++;
            }
            return maxDist;
        }

    }

    public static void main(String[] args) {

    }
}
