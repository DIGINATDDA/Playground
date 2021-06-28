#include<stdio.h>
int main()
{
int n,k,a[30],m=0;
  scanf("%d",&n);
  for(int c=0;c<n;c++ )
  {
     scanf("%d",&a[c]);
  }
   scanf("%d",&k);
  for(int c=0; c< n; c++)
  {
    for(int c=0; c< n-1; c++)
  {
      if(a[c]<a[c+1])
      {m=a[c];
       a[c]=a[c+1];
       a[c+1]=m;
      }
  }
  }
  printf("%d",a[k-1]);
return 0;
}