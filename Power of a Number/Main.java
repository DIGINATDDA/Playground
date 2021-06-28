import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
      int base,exp;
      base=br.nextInt();
      exp=br.nextInt();
      System.out.println(Math.pow(base,exp));
    }
}