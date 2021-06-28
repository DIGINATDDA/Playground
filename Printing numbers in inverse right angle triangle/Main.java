#include <stdio.h>
int main() {
int a,f=1,g=1,j=0;
  scanf("%d",&a);
  g=a;
  for(int b=1;b<=a;b++)
  {
      for(int d=1;d<=a-j;d++)
  {
        printf("%d",g);
        g--;
  
      }
    j++;
            printf("\n");
    g=a-f;
    f++;
  }
 
	return 0;
}