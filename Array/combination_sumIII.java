// Array : combination sum III
// Recursion solution
// Leetcode : https://leetcode.com/problems/combination-sum-iii/

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> final_list = new ArrayList<>();
        
        solution(new ArrayList<>(), final_list, k, n, 1);
        return final_list;
    }
    
    public void solution(List<Integer> arr, List<List<Integer>> final_list, int k, int n, int l)
    {
        if(n==0 && arr.size() == k)
        {
            final_list.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=l; i<=9; i++)
        {
            arr.add(i);
            // we want each number at most once, hence n-i
            solution(arr, final_list, k, n-i, i+1);
            arr.remove(arr.size()-1);
        }
    }
}
