**Recursion** : The function calling itself until the specific condition (base condition)

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

--------------------------------------------------------------------------------------------------------------------------

**Printing subsequences whose sum is equal to 'k'**

Sample code: (In actual code, we need to pass, target-sum and the current-sum to the function)

list1 - [] = an empty list contains subsequences whose sum is equal to 'k'

      func(index, list1, target_sum)
      {
            // base condition
            if (index == n)
            {
               // sum is equal to target_sum
               if (sum == target_sum)
                   // print the subsequences
            }
            
            // take the index
            list1.add(array[index]);
            sum = sum + array[index];
            
            // call the next index
            func(index+1, list1, sum);
            
            // remove the index
            list1.remove(array[index]);
            sum = sum - array[i];
            
            // call the next index without taking current
            func(index+1, list1, sum);
       }
       
