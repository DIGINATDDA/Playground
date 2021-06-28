#include<stdio.h>
#include<string.h>
int main()
{
int b=0,e=1;
     //  printf("%d",e);
 char s[100];
 gets(s);

  for(int c=0; c<strlen(s)/2; c++)
  {
    if(s[c]!=s[strlen(s)-e])
    {
      b=1;
      break;
    }
    e++; 
  }

  if(b==0)
    printf("%s is a palindrome",s);
  else
    printf("%s is not a palindrome",s);
    
  return 0;
}