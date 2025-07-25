class Count
{
    public static void main(String[] args) {
        int a[]={1,4,3,3,2,2,5};
        int n=7;
        countSort(a,n);
        printArray(a);
    }
    static int[] countSort(int a[], int n)
    {
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        largest=Math.max(a[i],largest);
       }
       int countt[]=new int[largest+1];
       for(int i=0;i<n;i++)
       {
        countt[a[i]]++;
       }
       int arrIndex=0;
       for(int i=0;i<countt.length;i++)
       {
           while(countt[i]>0)
           {
               a[arrIndex]=i;
               arrIndex++;
               countt[i]--;
           }
       }
       return a;
    }
    static void printArray(int a[])
    {
        for(int x:a)
        System.out.print(x+" ");
    }
}