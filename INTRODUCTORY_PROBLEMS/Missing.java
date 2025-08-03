import java.util.Scanner;

public class Missing { // Changed class name from Missing to Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        sc.close();
        long act = (long) n * (n + 1) / 2;
        System.out.println(act - sum);
    }
}