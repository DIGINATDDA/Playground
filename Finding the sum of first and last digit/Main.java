#include <stdio.h>
int main() {
int a,b,c;
  scanf("%d",&a);
  c=a%10;
  while(a>=10)
  {
    a=a/10;
  }
  printf("%d",a+c);
	return 0;
}