import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
      int c=br.nextInt();
      int r,sum=0;
      while(c!=0)
      {
       r=c%10;
        sum+=r;
        c=c/10;
      }
        System.out.println("Alice must go in path-"+sum);
	
}
}