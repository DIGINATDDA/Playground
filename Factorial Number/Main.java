import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
     int numb=b.nextInt();
      int i ,fact=1,c=0;
      for(i=1;i<=numb/2;i++)
      {
        fact=fact*i;
        if(fact==numb)
        {
          c=1;
        }
      }
      if(c==1)
      {
        System.out.println("Yes");
      }
      else
      {
       System.out.println("No");  
      }
    }
}