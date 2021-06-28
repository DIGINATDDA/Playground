#include <stdio.h>
int main()
{
  int a[20], b,d,h;
  scanf("%d",&b);
  for(int c=0; c<b; c++)
  {
     scanf("%d",&a[c]);
  }
  for(int c=0; c<b/2; c++)
  {
   
    for(h=0; h<b/2-1; h++)
  {
       if(a[h]>a[h+1])
       {
      d=a[h];
      a[h]=a[h+1];
      a[h+1]=d;
       }
  }
  }
  
  for(int c=0; c<b/2; c++)
  {
    for( h=b/2; h<b-1; h++)
  {
      if(a[h]<a[h+1])
       {
      d=a[h];
      a[h]=a[h+1];
      a[h+1]=d;
       }
  }
  }
  
  for(int c=0; c<b; c++)
  {
    printf("%d ",a[c]);
  }
   return 0;
}