// Array : Merge intervals
// Leetcode : https://leetcode.com/problems/merge-intervals/
// Video reference link : https://www.youtube.com/watch?v=2JzRBPFYbKE
// Need to repeat this

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        
        // base case
        if(intervals==null || intervals.length==0)
            return res.toArray(new int[0][]);
        
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        for(int i[]:intervals)
        {
            //merge the intervals
            if(i[0]<=end)
                end = Math.max(end, i[1]);
            else
            {
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
