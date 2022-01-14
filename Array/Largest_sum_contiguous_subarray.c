# Find Largest sum contiguous Subarray.[Very Important]
#include<stdio.h>

int main()
{
    int arr[10],size,i,min=0,first,second,third,max_so_far=-2147483648,max_ending_here;
    
    printf("Enter Size of an array : ");
    scanf("%d", &size);
    
    printf("Enter %d array elements below...\n",size);
    for(i=0; i<size; i++)
    {
        printf("arr[%d] : ",i);
        scanf("%d",&arr[i]);
    }
    
    max_so_far = 0, max_ending_here = 0; 
  
    for (i = 0; i < size; i++) 
    { 
        max_ending_here = max_ending_here + arr[i]; 
        if (max_so_far < max_ending_here) 
            max_so_far = max_ending_here; 
  
        if (max_ending_here < 0) 
            max_ending_here = 0;
    }
    
    printf("\n%d", max_so_far);
    return 0;
}
