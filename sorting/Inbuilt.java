import java.util.Arrays;
import java.util.Collections;
class Inbuilt
{
    public static void main(String[] args) {
        Integer a[]={1,3,4,2,5};
        Arrays.sort(a);
        int str_idx=0;
        int end_idx=3;
        Arrays.sort(a,str_idx, end_idx);
        Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(a,str_idx,end_idx,Collections.reverseOrder());
    }
}