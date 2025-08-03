import java.util.HashSet;

class evenMax
{
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14,15};
        int n=4;
        System.out.println(miss(a,n));
    }
    static int miss(int a[], int n)
    {
        HashSet<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int x:a)
        {
            if(x%2==0)
            {
                set.add(x);
                max=Math.max(max,x);

            }
        }
        for(int i=2;i<max;i+=2)
        {
            if(!set.contains(i))
            return i;
        }
        return max+2;
    }
}