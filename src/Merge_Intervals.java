import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_Intervals {
    // TODO: 7/9/2022
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> ans = new ArrayList<>();
            int[] current = new int[2];
//            current
            int i = 0;
            while (i < intervals.length - 1) {
                if (current[1] >= intervals[i + 1][0]) {
                    current = new int[]{current[0], intervals[i + 1][0]};
                    i++;
                } else {
                    ans.add(current);
                    current = intervals[i];
                    i++;
                }
            }
            return ans.toArray(new int[ans.size()][]);

        }
    }
}
