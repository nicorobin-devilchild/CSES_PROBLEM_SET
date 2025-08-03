import java.io.*;
import java.util.*;

public class Twosets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long total = n * (n + 1) / 2;

        if (total % 2 != 0) {
            bw.write("NO\n");
            bw.flush();
            return;
        }

        List<Long> set1 = new ArrayList<>();
        List<Long> set2 = new ArrayList<>();
        long target = total / 2;

        for (long i = n; i >= 1; i--) {
            if (i <= target) {
                set1.add(i);
                target -= i;
            } else {
                set2.add(i);
            }
        }

        bw.write("YES\n");

        bw.write(set1.size() + "\n");
        for (long x : set1) {
            bw.write(x + " ");
        }
        bw.write("\n");

        bw.write(set2.size() + "\n");
        for (long x : set2) {
            bw.write(x + " ");
        }
        bw.write("\n");

        bw.flush(); // Important to flush output
    }
}
