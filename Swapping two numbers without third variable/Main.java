import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
      int a,c;
      a=b.nextInt();
      c=b.nextInt();
      a=a+c;
      c=a-c;
      a=a-c;
      System.out.println(""+a);
      System.out.println(""+c);
      
    }
}