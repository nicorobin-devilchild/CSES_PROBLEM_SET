import java.util.*;
class Permute
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        StringBuilder even=new StringBuilder();
        StringBuilder odd=new StringBuilder();
        if(n==3||n==2)
        {
            System.out.println("NO SOLUTION");
            System.exit(0);
        }
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            even.append(i).append(" ");
            else odd.append(i).append(" ");
        }
        System.out.println(even.toString()+odd.toString());
    }
}