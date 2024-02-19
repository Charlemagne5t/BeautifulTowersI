import java.util.*;
public class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();

        long res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, sum(maxHeights, i));
        }

        return res;
    }
    long sum(List<Integer> maxHeights, int peak){
        int n = maxHeights.size();
        long sum = maxHeights.get(peak);
        if(peak > 0){
            long prev = maxHeights.get(peak);
            for (int i = peak - 1; i >= 0 ; i--) {
                long cur = Math.min(prev, maxHeights.get(i));
                prev = cur;
                sum += cur;
            }
        }
        if(peak < n - 1){
            long prev = maxHeights.get(peak);
            for (int i = peak + 1; i < n ; i++) {
                long cur = Math.min(prev, maxHeights.get(i));
                prev = cur;
                sum += cur;
            }
        }

        return sum;
    }
}