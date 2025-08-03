import java.util.*;
class Linear
{
    public static void main(String[] args) {
        int arr[]={10,23,32,41,11,20};
        int key=20;
        int index=search(arr,key);
        if(index>=0)
        System.out.println("Element is found at index:"+index);
        else System.out.println("ELement not found");
        int value=largest(arr);
        System.out.println("Largest number:"+ value);
    }
    static int search(int a[], int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            return i;
        }
        return -1;
    }
    static int largest(int a[])
    {
        Arrays.sort(a);
        int n=a.length;
        return a[n-1];
    }
}