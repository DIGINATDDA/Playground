import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
      int f1=0;
      int f2=1;
     
      int f3;
      int limit=b.nextInt();
      int i=1;
      while(i<limit)
      {
        f3=f1+f2;
         f1=f2;
        f2=f3;
        i++;
      }
      //  sum=sum+f3;
       
        
        System.out.println( f1);
        
        
          }
}