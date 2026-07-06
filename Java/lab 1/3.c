#include <stdio.h>
void main()
{
    int n;
    printf("enter a number:");
    scanf("%d", &n);
    int arr[n], i, sum=0;
    for(i=0; i<n; i++)
    {
        printf("enter a array:");
        scanf("%d", &arr[i]);
    }
    for(i=0; i<n; i++)
    {
        if(arr[i]%2==0)
        {
           sum=sum+arr[i];
        }
    }
    printf("%d", sum);
}