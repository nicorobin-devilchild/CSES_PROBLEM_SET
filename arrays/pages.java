class Pages
{
    public static void main(String[] args) {
        int a[]={4,10,20,30,40};
        int n=5;
        int max=40,sum=104;
        System.out.println(avg(a,n,max,sum));
    }
    static int avg(int a[], int n,int max,int sum)
    {
        int low=max;
        int high=sum;
        int result=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isPossible(a,n,mid))
            {
                result=mid;
                high=mid-1;
            }
            else low = mid+1;
        }
        return result;
    }
    static boolean isPossible(int a[], int n, int maxPages)
    {
        int days=1;
        int currentSum=0;
        for(int pages:a) {
            if(currentSum+pages>maxPages)
            {
                currentSum=pages;
                days++;
                if(days>5) return false;
                else currentSum+=pages;
            }
        }
        return true;
    }
}