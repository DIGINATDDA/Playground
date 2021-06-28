#include <stdio.h>
int main() {
int a,b=0;
  scanf("%d",&a);
  while(a>99)
  {
    a=a/10;
  }
  printf("%d",a%10);
	return 0;
}
