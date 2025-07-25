class Insertion {
    public static void main(String[] args) {
        int a[]={1,3,2,5,4};
        insertionSort(a);
        printArray(a);
    }
    static void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int current = a[i];
            int prev= i-1;
            while(prev>=0 && a[prev]>current)
            {
                a[prev+1] = a[prev];
                prev--;
            }

               a[prev+1]=current;
        }
    }
    static void printArray(int a[])
    {
        for(int x: a)
        {
            System.out.print(x+" ");
        }
    }
}
