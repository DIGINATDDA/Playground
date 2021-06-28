import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int s=sc.nextInt();
  int c=sc.nextInt();
  int grup=s/c;
  int erp=s%c;	
  System.out.println("The number of students in each team is " +grup + " and left out is " +erp);
    
}
}