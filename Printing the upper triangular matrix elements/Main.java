#include<stdio.h>
int main()
{
  int r,c,i,j,n=0,z;

 scanf("%d%d",&r,&c);

  int m[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &m[i][j]);
        }
    }	
  while(n<r)
  {
 z=n;
    for(i = 0; i < r && z<r; i++)
    {
      
       
         printf("%d ", m[i][z]);
          z++;
         
    }
    n++;
    
  }
 
	return 0;
}