import java.util.HashSet;
class Duplicate
{
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        if(check(a,4))
        System.out.println("true");
        else System.out.println("false");
    }
    static boolean check(int a[],int n)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int element:a)
        {
            if(set.contains(element))
            return true;
            else set.add(element);
        }
        return false;
    }
}