#include<stdio.h>
int main()
{
char s[100],k;
  int n;
  gets(s);
  scanf("%d",&n);
  n=n%26;
  for(int c=0; c< strlen(s); c++)
  {
  if(s[c]>='a' &&s[c]<='z')
  {
    s[c]=s[c]-n;
    if(s[c]<'a')
      s[c]=s[c]+26;
  }
    if(s[c]>='A' &&s[c]<='Z')
  {
    s[c]=s[c]-n;
    if(s[c]<'A')
      s[c]=s[c]+26;
  }
  }
 puts(s); 
  return 0;
}