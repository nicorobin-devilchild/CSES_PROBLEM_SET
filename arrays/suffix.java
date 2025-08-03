class Suffix
{
    public static void main(String[] args) {
        int a[]={4,2,5,7,1,3};
        int n=6;
        System.out.println(eval(a,n));
    }
    static int eval(int a[],int n)
    {
        int pre[]=new int[n];
        int suff[]=new int[n];

        pre[0]=a[0];
        suff[n-1]=a[n-1];

        for(int i=1;i<n;i++)
        pre[i]=pre[i-1]^a[i];

        for(int i=n-2;i>=0;i--)
        suff[i]=suff[i+1]^a[i+1];

        for(int i=0;i<n;i++)
        {
            if(pre[i]>suff[i])
            return i;
        }
        return -1;
    }
}