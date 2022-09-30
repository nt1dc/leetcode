package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//1710. Maximum Units on a Truck
//https://leetcode.com/problems/maximum-units-on-a-truck/
public class Maximum_Units_on_a_Truck {

    static class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (a,b)-> b[1]-a[1]);
            int max=0;
            for(int[] x : boxTypes){
                int noofboxes=x[0];
                int noofunits=x[1];
                if(truckSize>=x[0]){
                    max+=noofboxes*noofunits;
                    truckSize-=noofboxes;
                }
                else{
                    max+=truckSize*noofunits;
                    return max;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
    }
}
