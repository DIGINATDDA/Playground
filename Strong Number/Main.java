#include <stdio.h>
int main() {
	int c,b=1,d=0,a,e;
  scanf("%d",&c);
  e=c;
  while(c!=0)
  {
    a=c%10;
    c=c/10;
  while(a!=0)
  {
    b=b*a;
    a--;
  }

    d=d+b;
        b=1;
  }

  if(d==e)
    printf("Yes");
  else
     printf("No");
    
	return 0;
}