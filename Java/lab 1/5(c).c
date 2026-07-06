#include <stdio.h>
#include <string.h>
int main() {
char str[]="darshan";
int i,j;
for(i=0;i<strlen(str);i++){
for(j=0;j<=i;j++)
printf("%c",str[j]);
printf("\n");
}
return 0;
}