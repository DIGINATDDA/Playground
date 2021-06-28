import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
      int n=br.nextInt();
      int a=0;
      int b=0;
      int c=1;
      int d=0;
      int i=4;
      System.out.print(+a+" "+b+" "+c+" ");
      while(i<=n)
      {
        d=a+b+c;
         System.out.print(+d+" ");
        a=b;
        b=c;
        c=d;
        i++;
      }
      //System.out.print(+n+" ");
        
    }
}