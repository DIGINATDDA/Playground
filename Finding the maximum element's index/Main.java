import java.util.Scanner;
class Main
{
  public static int pb(int [] a, int b)
    { 
    int ind=0,max=0;
        for(int i =0; i<b; i++)
    { 
          if(max<a[i])
          {
            max=a[i];
            ind=i;
              
          }
    }
   return ind;
    }

 public static void main(String args[])
  {
   
Scanner n= new Scanner(System.in);
    
    int b = n.nextInt();
    int a[] = new int[b];
    for(int i =0; i<b; i++)
    {
      a[i]=n.nextInt();
    }
   int c=pb(a,b);
   System.out.println(c);
 }
  }