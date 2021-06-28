import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner br=new Scanner(System.in);
      int L1=br.nextInt();
      int L2=br.nextInt();
      int L3=br.nextInt();
      int L=br.nextInt();
      int count=0;
      if(L<=L1)
      {
        count++;
      }
      if(L<=L2)
      {
        count++;
      }
      if(L<=L3)
         {
           count++;
         }
      if(L>L1 || L>L2 || L>L3)
      {
        count=0;
      }
      System.out.println(count);
         
        
    }
}