import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int p,t;
      float r;
      Scanner br=new Scanner(System.in);
      p=br.nextInt();
      t=br.nextInt();
      r=br.nextFloat();
       
      float s=r/100;
      double sim=p*t*s;
      System.out.printf("%.2f",sim);
    }
}