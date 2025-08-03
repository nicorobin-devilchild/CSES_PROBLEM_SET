class Kadanes
{
    public static void main(String[] args) {
        int a[]={-1,2,-3,4,-2};
        int n=5;
        kadane(a,n);
    }
    static void kadane(int []a, int n)
    {
        int current_sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            current_sum=current_sum+a[i];
            if(current_sum<0)
            current_sum=0;
            max=Math.max(max,current_sum);
        }
        /*int current_sum=a[0];
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            current_sum=Math.max(current_sum+a[i],a[i]);
            max=Math.max(max,current_sum);
        }*/
        System.out.println("Maximum Sum: "+ max);

        
    }
}