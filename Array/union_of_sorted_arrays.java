// Array : Union of two sorted arrays
// GFG : https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
// Approach-1 : Using HashSet
// Time complexity : O((m+n)log(m+n)) - Inserting a element in set takes logN time, where N is no of elements in set. 
// At max set can store m+n elements {when there are no common elements and elements in arr,arr2 are distntict}. 
// So Inserting m+n th element takes log(m+n) time. Upon approximation across inserting all elements in worst it would take O((m+n)log(m+n) time.
// Using unordered_set also takes the same time, On average insertion in unordered_set takes O(1) time but sorting the union vector takes O((m+n)log(m+n)) time. 
// Because at max union vector can have m+n elements.
// Space complexity : O(m+n) {If Space of Union Vector is considered} 
// Space complexity : O(1) {If Space of union Vector is not considered}

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i=0; i<n; i++) {
            hset.add(arr1[i]);
        }
        
        for(int i=0; i<m; i++) {
            hset.add(arr2[i]);
        }
        
        ArrayList<Integer> arr = new ArrayList<>(hset);
        Collections.sort(arr);
        return arr;
    }
}

// Approach-2 : Two pointers approach
// Very good explaination is here - https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
// Time Complexity: O(m+n), Because at max i runs for n times and j runs for m times, When there are no common elements in 
// arr1 and arr2 and all elements in arr1, arr2 are distinct. 
// Space Complexity : O(m+n) {If Space of Union ArrayList is considered} 
// Space Complexity : O(1) {If Space of union ArrayList is not considered}

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        // Two pointers approach
        int i=0, j=0;
        ArrayList<Integer> union = new ArrayList<>();
        
        while(i<n && j<m) {
            if(arr1[i] <= arr2[j]) {
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i])
                    union.add(arr1[i]);
                i++;
            } else {
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        
        while(i<n) {
            if(union.get(union.size()-1)!=arr1[i])
                union.add(arr1[i]);
            i++;
        }
        
        while(j<m) {
            if(union.get(union.size()-1)!=arr2[j])
                union.add(arr2[j]);
            j++;
        }
        
        return union;
    }
}

// Intersection of Two sorted arrays - https://takeuforward.org/data-structure/intersection-of-two-sorted-arrays/
