import java.io.*;
class CoinPiles {
    public static void main(String[] args) throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long t=Long.parseLong(br.readLine());
        while(t-->0)
        {
            String[] array= br.readLine().split(" ");
            long x=Long.parseLong(array[0]);
            long y= Long.parseLong(array[1]);
            long min=Math.min(x,y);
            long max=Math.max(x,y);
            if((x+y)%3==0 && max/2<=min)
            System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
