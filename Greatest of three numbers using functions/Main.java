#include <stdio.h>
int main(){
int a,b,c,d;
  scanf("%d%d%d",&a,&b,&c);
 d= call(a,b);
  if(d>c)
    printf("%d",d);
  else
       printf("%d",c);
  	return 0;
}
int call (int a, int b)
{int d;
  if(a>b)
    d=a;
 else
   d=b;
 return d;
}