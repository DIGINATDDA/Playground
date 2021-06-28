import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner br=new Scanner(System.in);
    int len=br.nextInt();
    int bri=br.nextInt();
    System.out.println(+(2*len)+(2*bri) +"m");
      System.out.println(+ (len*bri)+"sqm");
  }
}