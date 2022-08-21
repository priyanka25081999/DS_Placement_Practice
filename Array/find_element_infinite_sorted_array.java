// Array : Find an element in an infinite sorted array
// Approach : Binary serach

// 1. initialize start = 0, end = 1
// 2. compare end with target element
// 3. if target element is greater than end, then first move the start to end and move end by 2 i.e end = end * 2
// 4. repeat the step-3 until target becomes lesser than end
// 5. once we get a finite array, apply binary search on it.

/* pseudocode

  int start=0, end=1;
  while(target > arr[end])
  {
     start = end;
     end = end*2;
  }

  // now apply binary search
  while(start <= end)
  {
     int mid = start + (end-start)/2;
     if(arr[mid] == target)
        return mid;
     else if(target < arr[mid])
        end = mid-1;
     else
        start = mid+1;
  }

  return -1;
  
*/
