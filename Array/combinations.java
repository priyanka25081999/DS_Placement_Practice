// Array : Combinations 
// Recursion and backtracking approach
// Given two integers n and k, return all possible combinations of k numbers out of the range [1, n]. You may return the answer in any order.
// https://leetcode.com/problems/combinations/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // Make 2 lists
        // 1st would be an internal list which holds all combinations = [2,4],[3,4],[2,3] and so on
        // 2nd would contain internal list to make a final result list = [[2,4],[3,4],[2,3],etc]
        List<List<Integer>> result_list = new ArrayList<>();
        List<Integer> internal_list = new ArrayList<>();
        
        generate_combinations(1, n, k, result_list, internal_list);
        
        // return result(outer) list
        return result_list;
    }
    
    public static void generate_combinations(int start, int n, int k, List<List<Integer>> result_list, List<Integer> internal_list)
    {
        // check if internal list size matches to k number which means we hit the limit for internal list
        // then add the internal list into final result list
        if(internal_list.size() == k)
        {
            // add this internal list into final result list
            result_list.add(new ArrayList<Integer>(internal_list));
            return;
        }
        
        // start forming combinations within given range from start to n and add them into internal list
        for(int i=start; i<=n; i++)
        {
            internal_list.add(i);
            // To form combination, recursively call this function
            generate_combinations(i+1, n, k, result_list, internal_list);
            // finally remove the last element from list
            internal_list.remove(internal_list.size()-1);
        }
    }
}
