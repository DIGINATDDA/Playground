import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner f=new Scanner(System.in);
    int x1=f.nextInt();
     int y1=f.nextInt();
     int x2=f.nextInt();
     int y2=f.nextInt();
    float t=(float) (x1+x2)/2;
    float d=(float) (y1+y2)/2;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",t,d);
  }
}