import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static double prime(int b)
  {int f=0;
 
    for(int a=2; a<=b/2;a++)
    {
      if(b%a ==0)
      {
        f=1;
        break;
      }
    }
    if( f==0)
    return (1);
   else
     return (0);
     
  }
  public static void main(String args[])
  {
   Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    for(int b=2; b<=a; b++)
    {
      int c=(int)prime(b);
      if(c==1)
      {  System.out.println(b);
      }
    }
      

  
  
  }
}