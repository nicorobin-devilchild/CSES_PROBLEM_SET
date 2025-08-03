class Rainwater
{
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        int n=7;
        System.out.println("Totally Trapped Rainwater: "+water(a,n));
    }
    static int water(int a[], int n)
    {
        //left max boundary
        int leftmax[]=new int[n];
        leftmax[0]=a[0];
        for(int i=1;i<n;i++)
        {
            int current=a[i];
            leftmax[i]=Math.max(leftmax[i-1], current);
        }
        //right max boundary
        int rightmax[]= new int[n];
        rightmax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            int current=a[i];
            rightmax[i]=Math.max(current,rightmax[i+1]);
        }
        int trapped_water=0;
        for(int i=0;i<n;i++)
        {
            int height=a[i];
            int water_level=Math.min(leftmax[i], rightmax[i]);
            trapped_water+=water_level-height;
        }
         
       return trapped_water;
    }
}