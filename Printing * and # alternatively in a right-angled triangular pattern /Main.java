#include <stdio.h>
int main() {
int a,c,e=1;
  scanf("%d",&a);
  for(int b=0;b<a;b++)
  {
      for(int d=0;d<=b;d++)
  {if(e%2==1)
    printf("*");
   else
        printf("#");
   e++;
   }
      printf("\n");
  }
	return 0;
}