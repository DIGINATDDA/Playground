import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
      int a,c;
      a=b.nextInt();
      c=b.nextInt();
      if(a==c)
      {
        System.out.println(+a +" and " +c+ " are equal");
      }
      else if(a<c)
      {
        System.out.println(+a +" less than " +c);
           }
          else
                           {
                             System.out.println(+a+" greater than " +c);
                           }
                           
      
       
    }
}