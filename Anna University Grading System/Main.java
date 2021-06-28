import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner br=new Scanner(System.in);
                              int mrk=br.nextInt();
                              if(mrk>100)
                              {
                                System.out.println("Invalid");
                              }
                              else if(mrk==100)
                              {
                                System.out.println("S");
                              }
                              else if(mrk>=90 && mrk<=99)
                              {
                                System.out.println("A");
                              }
                              else if(mrk>=80 && mrk<=89)
                              {
                                System.out.println("B");
                              }
                                                   
                                 else if(mrk>=70 && mrk<=79)
                              {
                                System.out.println("C");
                              }
                               else if(mrk>=60 && mrk<=69)
                              {
                                System.out.println("D");
                              }
                               else if(mrk>=50 && mrk<=59)
                              {
                                System.out.println("D");
                              }
                               else 
                              {
                                System.out.println("F");
                              }
                              
    }
}