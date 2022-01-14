# Find the first non-repeating element in a given array of integers.
int main()
{
    int i,j,arr[10],n,k,cnt=0;
    
    printf("Enter size of an array : ");
    scanf("%d",&n);
    
    printf("\nEnter %d array elements below...\n",n);
    for(i=0; i<n; i++)
    {
        printf("arr[%d] : ",i);
        scanf("%d",&arr[i]);
    }
    
    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {   // i!=j means if i and j are not pointing to the same 
            if(arr[i]==arr[j] && i!=j)  
            {   
                break;
            }
        }
        if(j==n)
        {   printf("%d ",arr[i]);
            break;
        }
    }
    
    return 0;
}
