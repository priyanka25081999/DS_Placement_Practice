Recursion : The function calling itself until the specific condition (base condition)

Sample code to find subsequences using recursive approach:

list1 - [] = an empty list contains subsequences that we are trying to form

func(index, list1)
{
   if (index >= n)
   {
      // print the list
      return;
   }
   
   // there can be two choices
   // Either we can take the element or we can skip (not take) the element
   list1.add(array[index]);
   
   // take this element in subsequence list
   func(index+1, list1);
   
   // remove the element from subsequence list
   list1.remove(array[index]);
   
   // Skip (not take) this and take other elements
   func(index+1, list1);
}

Time complexity : O(2^n) * n as we have 2 options for each index and we use for loop to print 'n' elements
Space complexity : At max 3 recursion calls will be waiting in a stack space O(n). Depth of recursion we can have is 'n'
