package pers.lilpen.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : phs
 * @version : 1.0
 * @date : 2024/7/30 21:15
 */
public class Merge_LeetCode_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, ((o1, o2) -> {
            return o1[0] - o2[0];
        }));
        ArrayList<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            int left = interval[0];
            int right = interval[1];
            if (res.isEmpty() || res.get(res.size() - 1)[1] < left) {
                res.add(new int[]{left, right});
            } else {
                res.get(res.size() - 1)[1] = Math.max(right, res.get(res.size() - 1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
