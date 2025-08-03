class Reverse
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=5;
        System.out.println("The Original Array:");
        printArray(a);
        for(int i=0;i<n/2;i++)
        {
            swap(i,n-i-1,a);
        }
        System.out.println("Reversed Array");
        printArray(a);
        
    }

    static void swap(int i, int j, int a[])
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }

    static void printArray(int a[]){

        for(int element: a)
        System.out.print(element+" ");
        System.out.println();
    }
    
}