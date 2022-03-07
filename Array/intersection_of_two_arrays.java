// Array : Intersection of two arrays
// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // Sort the arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        // Create an Arraylist
        // For dynamic size, created an arraylist
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=0, j=0, k=0;
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] == nums2[j])
            {   list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
                j++;
        }
       
        // Create an final array
        int ans[] = new int[list.size()];
        for(int l : list)
            ans[k++] = l;
        
        return ans;
    }
}
