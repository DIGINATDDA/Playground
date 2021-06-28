#include <stdio.h>
int main() {
int a,c;
  scanf("%d",&a);
  for(int b=1;b<=a;b++)
  {c++;
    printf("%d",b);
   if(c==3)
   {
         printf(",");
     c=0;
   }
  }
	return 0;
}