#include<stdio.h>
int main()
{
 int n,k,a[30],m=0,s=1;
 scanf("%d",&n);
  scanf("%d",&k);
  for(int c=0; c<n; c++)
  {
    scanf("%d",&a[c]);
  }while(s<=k)
  {
  for(int c=0; c<n; c++)
  {
    if(s==a[c])
      m++;
  }
   
   
    printf("%d %d\n",s,m);
     s++;
     m=0;
  }
  return 0;
}