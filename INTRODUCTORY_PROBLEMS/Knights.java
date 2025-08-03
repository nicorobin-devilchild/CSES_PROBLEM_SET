import java.util.*;
class Knights
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=1;
        while(k<=n)
        {
            long total= k*k*((k*k)-1)/2;
            long pawsible= 4*(k-1)*(k-2);
            System.out.println(total-pawsible);
            k++;
        }
    }
}