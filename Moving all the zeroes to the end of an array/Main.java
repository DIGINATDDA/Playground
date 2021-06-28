import java.util.Scanner;
class Main 
{  public static void count(int [] a, int b)
{
  int c=0,j=0;
  int d[]=new int [b];
     for(int i =0;i<b; i++)
    {
      if(a[i]==0)
     c++;
       else
       {
         d[j]=a[i];
         j++;
       }
      
    }
    for(int i =0;i<b; i++)
    {
    System.out.print(d[i]+" ");
    }
  
}

  public static void main(String args[])
    {
    	Scanner n = new Scanner(System.in);
    int b = n.nextInt();
   
    int a[] = new int[b];
    for(int i =0;i<b; i++)
    {
      a[i]=n.nextInt();
    }
   count(a,b);
    
       
    }
  	
}