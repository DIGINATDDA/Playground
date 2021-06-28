#include <stdio.h>
int main()
{
int a[20],x,y;
  scanf("%d",&x);
  for(int b=0; b<x; b++)
  {
    scanf("%d",&a[b]);
  }
  
  for(int b=0; b<x; b++)
  {
    for(int c=b+1; c<x; c++)
  {
      if(a[c]>a[b])
        printf("%d,%d\n",a[b],a[c]);
  }
  }
   return 0;
}