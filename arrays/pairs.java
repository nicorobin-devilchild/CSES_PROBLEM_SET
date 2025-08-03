class Pairs
{
    public static void main(String[] args) {
        int n=5;
        int a[]={1,2,3,4,5};
        for(int i=0;i<n-1;i++)
        {
            System.out.print("{");
            for(int j=i+1;j<n;j++)
            {
                System.out.print("["+ a[i]+","+a[j]+"]");
            }
            System.out.println("}");
        }
    }
}