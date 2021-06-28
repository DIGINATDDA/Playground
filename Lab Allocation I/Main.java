import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
     int L1=br.nextInt();
     int L2=br.nextInt();
      int L3=br.nextInt();     
      if(L1<L2)
      {
        if(L1<L3)
        {
      System.out.println("L1");
        }
        else 
        {
          System.out.println("L3");
        }
      }
      else
      {
        System.out.println("L2");
      }
      
    }
}