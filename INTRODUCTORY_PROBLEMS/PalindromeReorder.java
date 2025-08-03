import java.io.*;
class PalindromeReorder {
    public static void main(String[] args) throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int count[]=new int[26];
        for(char ch: str.toCharArray())
        {
            count[ch-'A']++;
        }
        int oddIndex=-1, oddcount=0;
        for(int i=0;i<26;i++)
        {
            if(count[i]%2!=0)
            {
                oddcount++;
                oddIndex=i;
            }
        }
        if(oddcount>1)
        {
            System.out.println("NO SOLUTION");
            System.exit(0);
        }
        StringBuilder left=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            if(count[i]%2==0)
            {
                long half=count[i]/2;
            for(int j=0;j<half;j++)
            {
                  left.append((char) ('A'+i));
            }
            }
        }
        if(oddIndex!=-1)
        {
            for(int i=0;i<count[oddIndex];i++)
            middle.append((char)(oddIndex+'A'));
        }
        StringBuilder right=new StringBuilder(left).reverse();
        System.out.println(left.toString()+middle.toString()+right.toString());

    }
}
