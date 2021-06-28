import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
      float x,y;
      x=br.nextFloat();
      y=br.nextFloat();
      y=12*y;
      if(y==x)
      {
        System.out.println("No profit nor loss");
      }
      else if(y>x)
      {
        y=y-x;
         System.out.printf("Profit : Rs.%.2f",+y);
      }
      else 
      {
       x=x-y;
        System.out.printf("Loss : Rs.%.2f",+x);
      }
     
      
    }
}