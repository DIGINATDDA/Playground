import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner br=new Scanner(System.in);
      int birthyr=br.nextInt();
      int currentyr=br.nextInt();
      if(currentyr<birthyr)
      {
       birthyr  =100-birthyr;
        int c=birthyr+currentyr;
        
        System.out.println(c);
      }
      else
      {
         System.out.println(currentyr-birthyr);
      }
    }
}