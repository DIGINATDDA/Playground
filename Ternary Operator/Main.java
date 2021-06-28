import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
      int n=br.nextInt();
      String evenodd = (n % 2 ==0) ? "Even": "Odd";
    
      
        System.out.println(evenodd);
    }
}