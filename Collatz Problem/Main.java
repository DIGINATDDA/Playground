import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
     // while(num<
     // while(num>=0 )
       //  while(num>=0)  
     // while(num>=1)Syste
      System.out.println(num);
      //int count==
      int count=0;
      while(num!=1)
            //=0)
      {
      if(num%2==0)
      {
        //fill your code;
        num=num/2;
       // count++;
      //  System.out.println(count);count
        System.out.println(num);
      }
      else
      {
        num=((3*num)+1);
        System.out.println(num);
        //System.out.println(count);
      }
        //System.out.println(num);
        count++;
        
      }
      System.out.println(count);
    }
}