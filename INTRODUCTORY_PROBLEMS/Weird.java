import java.util.*;
public class Weird
{
    public static void main(String[] args) {
  
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
         sc.close();
        System.out.print(n+" ");
        while(n!=1)
        {
            
            if(n%2==0)
            n/=2;
            else
            n=(n*3)+1;
            System.out.print(n+" ");
        }
    }
}