import java.io.*;

public class Spiral {
    public static void main(String[] args) throws IOException {
        // Fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Fast output
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            long y = Long.parseLong(parts[0]);
            long x = Long.parseLong(parts[1]);

            long n = Math.max(y, x);
            long result;

            if (n % 2 == 0) {
                if (y == n)
                    result = n * n - x + 1;
                else
                    result = (n - 1) * (n - 1) + y;
            } else {
                if (x == n)
                    result = n * n - y + 1;
                else
                    result = (n - 1) * (n - 1) + x;
            }

            out.println(result);
        }

        out.flush(); 
    }
}
