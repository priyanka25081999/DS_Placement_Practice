// Array :  Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/
// Simple Approach

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        
        for(int i=0; i<items.size(); i++)
        {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
                cnt++;
            else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
                cnt++;
            else if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
                cnt++;
        }
        
        return cnt;
    }
}
