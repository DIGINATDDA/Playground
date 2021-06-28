#include<stdio.h>
int main()
{
  int r,c,i,j,n=0,z=0;

 scanf("%d%d",&r,&c);

  int m[r][c],h[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &m[i][j]);
        }
    }	
  
   for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &h[i][j]);
        }
    }
  
  
     for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
          if(h[i][j] != m[i][j])
          {
            z=1;
            break;
          }
        }
    }
  
  if(z==1)
    printf("No");
  else
       printf("Yes");
    
  
  
 
	return 0;
}