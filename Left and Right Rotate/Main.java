import java.util.Scanner;
class Main 
{
   public static void or(int [] a,int b)
   {int m=0;
     if(b%2 ==0)
     {
        m =b-1;
     }
     else
       m=b;
     int h=a[m-1];
     for(int i =m-1;i>1; i--)
    {
      a[i]=a[i-2];
       i--;
    }
     a[0]=h;
   
     // er(a,b);
   }
    public static void er(int [] a,int b)
   {  int m=0; 
            if(b%2 ==0)
     {
      m =b;
     }
     else
       m=b-1;
       int h=a[1];
     for(int i =1;i<m-2; i++)
    {
      a[i]=a[i+2];
       i++;
    }
       a[m-1]=h;
 
   }
  public static void main(String args[])
    {
    	Scanner n = new Scanner(System.in);
    int b = n.nextInt();
   
    int a[] = new int[b];
    for(int i =0;i<b; i++)
    {
      a[i]=n.nextInt();
    }
    int d = n.nextInt();
             for(int i =0;i<d; i++)
    {
               or(a,b);
             }
   
            for(int i =0;i<d; i++)
    {
              er(a,b);
            }
               for(int i =0;i<b; i++)
    {
      System.out.print(a[i]+" ");
    }
  	}
}