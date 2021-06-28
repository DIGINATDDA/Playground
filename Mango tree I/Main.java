import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	int r,c,n;
      Scanner br=new Scanner(System.in);
      r=br.nextInt();
      c=br.nextInt();
      n=br.nextInt();
      if(n%c==1 || n%c==0 || n<=c )
        System.out.println("Yes");
        else  
          System.out.println("No");
      	}
}