class Sum_SubArrays
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=5;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                 int sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                    sum+=a[k];
                }
                max=Math.max(sum,max);
                System.out.println("Sum: "+ sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum:"+ max);
    }
}