#include <stdio.h>
int main() {
int a,f=1,g=1;
  scanf("%d",&a);
  for(int b=1;b<=a;b++)
  {
      for(int d=1;d<=a-f;d++)
  {
        printf(" ");
  
        
  }
    f++;
      for(int e=1;e<=2*g-1;e++)
  {
         printf("*");
      }
g++;
             printf("\n");
  }
	return 0;
}