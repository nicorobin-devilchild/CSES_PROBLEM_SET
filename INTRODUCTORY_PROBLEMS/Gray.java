import java.io.*;
import java.util.*;

class Gray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 1 << n;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            String bin = String.format("%" + n + "s", Integer.toBinaryString(gray)).replace(' ', '0');
            bw.write(bin);
            bw.newLine(); // Faster than println
        }

        bw.flush(); // Push all buffered output at once
        bw.close(); // Close the writer
        sc.close();
    }
}
