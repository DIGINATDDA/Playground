import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner br=new Scanner(System.in);
      int a=br.nextInt();
       int b=br.nextInt();
       int c=br.nextInt();
      int z=((a*b)-(a*c))-100;
      System.out.println("The profit obtained is Rs."+z);
	}
}