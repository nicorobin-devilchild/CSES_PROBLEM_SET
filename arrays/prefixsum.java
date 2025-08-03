class Prefixsum
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=5;
        int[] prefix_sum=new int[5];
        prefix_sum[0]=a[0];
        for(int i=1;i<n;i++)
        {
            prefix_sum[i]=prefix_sum[i-1]+a[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int current_sum=0;
            for(int j=i+1;j<n;j++)
            {
                current_sum=(i==0)?prefix_sum[j]:prefix_sum[j]-prefix_sum[i-1];
                max=Math.max(current_sum,max);
            }

        }
        System.out.println("Maximum Sum: "+ max);
    }
}