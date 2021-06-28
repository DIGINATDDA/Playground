import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner n = new Scanner(System.in);
    int a = n.nextInt();
    a=a/10;
    System.out.println(a%10);
  }
}