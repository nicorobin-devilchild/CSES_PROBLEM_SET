class Bubble {
    public static void main(String[] args) {
        int a[]={1,3,2,4,3,6,4};
        int n=7;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                swap(i,j,a);
            }
        }
        printArray(a);
    }
    static int[] swap(int i, int j, int arr[])
    {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
        return arr;
    }
    static void printArray(int arr[])
    {
        for(int x:arr)
        System.out.print(x+" ");
    }
}
