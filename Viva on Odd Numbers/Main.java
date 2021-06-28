import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b=new Scanner(System.in);
      int num;
      float score=0.0f;
      int count=0;
      do
      {
        num=b.nextInt();
        if(num<0)
        {
          score=(float)(score-1);
        }
       else if(num%2==1)
        {
          score=(float)(score+1);
          count++;
        }
      
        else 
          
        {
          score=(float)(score-0.5);
          
        }
      }
        while((num>0)&&(count!=3));
      
      System.out.println(score);
      
    }
}