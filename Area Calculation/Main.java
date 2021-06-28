import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,l,b;
      double s3;
      float r;
      Scanner br= new Scanner(System.in);
      	a=br.nextInt();
      l=br.nextInt();
      b=br.nextInt();
      r=br.nextFloat();
        
        s3=(3.14*(r*r));
      System.out.println(a*a);
      System.out.println(l*b);
      System.out.printf("%.3f",s3);
      
    }
}