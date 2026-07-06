#include <stdio.h>
void main()
{
    int n;
    printf("enter a number:");
    scanf("%d", &n);
    int i;
    for (i = 0; i<n; i++)
    {
        if (n%i==0)
        {
            printf("%d ,", i);
        }
        
    }
    
}