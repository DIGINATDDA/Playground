#include<stdio.h>
int main()
{
	int a[20],b,d=0;
  scanf("%d",&b);
  for(int c=0; c<b; c++)
  {
     scanf("%d",&a[c]);
  }
   for(int c=0; c<b/2; c++)
  {
  for(int c=0; c<b/2-1; c++)
  {
if(a[c]>a[c+1])
{
  d=a[c];
  a[c]=a[c+1];
  a[c+1]=d;
}
  }
   }
  
   for(int c=0; c<b; c++)
  {
     printf("%d ",a[c]);
  }
  
	return 0;
}