class Binary
{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int key=40;
        System.out.println("Element found at index: "+search(arr,key));
    }
    static int search(int a[], int key)
    {
        int low=0,high=a.length-1;
        while(low<high)
        {
            int mid=(low+high)/2;
            if(a[mid]==key)
            return mid;
            else if(a[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
}