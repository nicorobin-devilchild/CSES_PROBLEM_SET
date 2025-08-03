class Frog {
    public static void main(String[] args) {
        int a[]={2,3,1};
        int n=3;
        System.out.println(pads(a,n));
    }
    static int pads(int a[], int n)
    {
        int currentSum=0;
        int window=n-1;
         
        for(int i=0;i<window;i++)
        currentSum+=a[i];

        int maxPetals=currentSum;

        for(int i=window;i<n;i++)
        {
            currentSum= currentSum-a[i-window]+a[i];
            maxPetals=Math.max(maxPetals,currentSum);
        }
        return maxPetals;
    }
}
