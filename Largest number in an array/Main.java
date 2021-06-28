import java.util.Scanner;
class Main{
   public static int ln(int [] a, int b)
   {int l=0;
      for(int i =0; i<b; i++)
      {
        if(l<a[i])
        {
       l=a[i];
        }
        
      }
    
      return(l);
     
   }
    public static void main(String args[]){
      Scanner n =new Scanner(System.in);
      int b = n.nextInt();
       int a[] = new int [b];
      for(int i =0; i<b; i++)
      {
        a[i]= n.nextInt();
      }
      
      System.out.println(ln(a,b));
    }
}