import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static double power(int a, int b)
  {
    double c= (Math.pow(a,b));
    return (c);
  }
  public static void main(String args[])
  {
   Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    int b = n.nextInt();
   int c = (int) power(a,b);
    System.out.println(c);
  }
}