import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int id=0,flag=0;
    System.out.println("Registration");
    Scanner br=new Scanner(System.in);
   
      System.out.println("Enter your name");
      String name=br.nextLine();
       System.out.println("Enter your address");
      String address=br.nextLine();
       System.out.println("Contact Number");
      String ContactNumber=br.nextLine();
       System.out.println("E-Mail ID");
      String eMailID=br.nextLine();
       System.out.println("Enter proof type");
      String prooftype =br.nextLine();
    System.out.println("Enter proof id");
      String proofid =br.nextLine();
       
    for(int i=1;i<100;i++)
    {
      id=id+i;
      flag=1;
      break;
    }
if(flag==1)
{
  System.out.println("Customer Details");
    System.out.println(name);
System.out.println(address);
System.out.println(ContactNumber);
System.out.println(eMailID);
System.out.println(prooftype);
  System.out.println(proofid);
  
  System.out.println("Thank you for registering. Your id is "+id+"...");
}
      
      }
}