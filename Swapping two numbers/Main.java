import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
      int a,c,temp;
      a=b.nextInt();
      c=b.nextInt();
      temp=a;
      a=c;
      c=temp;
      System.out.println(""+a);
      System.out.println(""+c);
    }
}