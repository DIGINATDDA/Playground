import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
      Scanner br=new Scanner(System.in);
      float s1,s2,s3,s4,s5;
      s1=br.nextFloat();
      
      s2=br.nextFloat();
      
      s3=br.nextFloat();
      
      s4=br.nextFloat();
 
      s5=br.nextFloat();
      float avg;
      avg=(s1+s2+s3+s4+s5)/5;
      System.out.println(""+avg);
     
      
      
     
    }
}