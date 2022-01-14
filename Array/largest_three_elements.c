# Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
#include<stdio.h>

int main()
{
    int arr[10],size,i,min=0,first,second,third;
    
    printf("Enter Size of an array : ");
    scanf("%d", &size);
    
    printf("Enter %d array elements below...\n",size);
    for(i=0; i<size; i++)
    {
        printf("arr[%d] : ",i);
        scanf("%d",&arr[i]);
    }
    
    first=second=third=min;
    for(i=0; i<size; i++)  
    {
        if(arr[i]>first)
        {
            third=second;
            second=first;
            first=arr[i];
        }
        else if(arr[i]>second)
        {
            third=second;
            second=arr[i];
        }
        else if(arr[i]>third)
        {
            third=arr[i];
        }
    }
    printf("\n%d %d %d", first, second, third);
    return 0;
}
