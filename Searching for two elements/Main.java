import java.util.Scanner;
class Main{
   public static int se(int [] a, int b1, int b)
   {int f=-1;
      for(int i =0; i<b; i++)
      {
        if(a[i]== b1)
        {
        f=i;
          break;
        }
        
      }
    
      return(f);
     
   }
    public static void main(String args[]){
      Scanner n =new Scanner(System.in);
      int b = n.nextInt();
       int a[] = new int [b];
      for(int i =0; i<b; i++)
      {
        a[i]= n.nextInt();
      }
       int b1 = n.nextInt();
       int b2 = n.nextInt();
      System.out.println(se(a,b1,b));
      System.out.println(se(a,b2,b));
    }
}