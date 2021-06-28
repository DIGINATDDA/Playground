#include<stdio.h>

int main()
{
  int a,c;
  scanf("%d",&a);
  int b[a],z=0;
  for(int y=0;y<a;y++)
  {
      scanf("%d",&b[y]);
  }
  scanf("%d",&c);
  
   for(int e=0;e<a-1;e++)
  {
      for(int d=e+1;d<a;d++)
  {if(b[e]+b[d]==c)
  {printf("Perfect couple: %d %d",b[e],b[d]);
         z=1;
   break;


  }
      }
     
   }
  if(z==0)
    printf("No perfect couple found!");
    return 0;
}

