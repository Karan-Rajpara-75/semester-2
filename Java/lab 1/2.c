#include <stdio.h>
void main()
{
    int n, i, rev=0, sum=0;
    printf("Enter a number:");
    scanf("%d", &n);
    for(i=0;n!=0;i++)
    {
        rev=n%10;
        n=n/10;
        sum=sum+rev;
    }
    printf("%d", sum);
}