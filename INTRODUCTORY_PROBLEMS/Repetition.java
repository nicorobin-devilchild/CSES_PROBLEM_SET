import java.util.Scanner;
public class Repetition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int count=0,max=0;
        int j=1;
        for(int i=0;i<str.length()-1;i++)
        {
             if(str.charAt(i)==str.charAt(j))
             {
                count++;
                j++;
                max=Math.max(count,max);
             }
             else if(str.charAt(i)!=str.charAt(j))
             {
                j++;
                count=0;
             }
        }
        System.out.println(max+1);
    }
}
