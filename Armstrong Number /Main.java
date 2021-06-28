#include <stdio.h>
int main() {
int a,b=0,c=0,d,e;
  scanf("%d",&a);
  d=a;
  e=d;
    
 while(a!=0)
 {
   b++;
   a=a/10;
 }
 
  while(d!=0)
 {
c=c+(pow((d%10),b));
    d=d/10;
 }
  if(e==c)
    printf("Armstrong Number");
  else
     printf("Not an Armstrong Number");
	return 0; 
}