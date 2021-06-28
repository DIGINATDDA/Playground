import java.util.Scanner;
class Main 
{ 
  public static void count(int [] a, int b,int c)
{
     for(int i=0 ;i<b-1;i++)
    {
     
     for(int j=i+1;j<b;j++)
    {
      if(a[i]+a[j]==c)
         System.out.println(a[i]+", "+a[j]);
   
    }
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
    int c = n.nextInt();
   count(a,b,c);
    
       
    }
  	
}