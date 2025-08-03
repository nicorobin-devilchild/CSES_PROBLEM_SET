class Stocks
{
    public static void main(String[] args) {
        int a[]={7,1,3,2,6,5};
        int n=6;
        System.out.println("Maximum Profit possible: "+ stock(a,n));
    }
    static int stock(int a[], int n)
    {
        int buyPrice=a[0];
        int max=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]>buyPrice)
            {
                int profit=a[i]-buyPrice;
                max=Math.max(profit,max);
            }
            else buyPrice=a[i];
        }
        return max;
    }
}