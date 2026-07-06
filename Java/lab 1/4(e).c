#include <stdio.h>
void main()
{
    int i, j, n, k;
    printf("enter a number:");
    scanf("%d", &n);
    n=n-1;
    for(i=0;i<=n;i++)
    {
        for(k=0; k<n-i; k++)
        {
            printf(" ");
        }
        for(j=0;j<i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    for(i=0;i<n-1;i++)
    {
        for(k=0; k<i+1; k++)
        {
            printf(" ");
        }
        for(j=0;j<n-i-1;j++)
        {
            printf("* ");
        }
        printf("\n");
    }

}