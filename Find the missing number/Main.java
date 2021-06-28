#include<stdio.h>
int main()
{
int a[20],b,e=0;
  scanf("%d",&b);
  for(int c=0; c<b; c++)
  {
    scanf("%d",&a[c]);
  }
  for(int c=1; c<=b; c++)
  {
     for(int d=0; d<b; d++)
  {
       if(c==a[d])
       {
         e=1;
       }
     }
    if(e==0)
      printf("%d ",c);
    
    e=0;
    
  }
  return 0;
}