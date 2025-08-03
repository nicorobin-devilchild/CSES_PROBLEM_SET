import java.util.*;

class BitStrings {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(power(2, n, MOD));
    }

    static long power(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod; //update result at right moments
            base = (base * base) % mod; //update base even when last digit is zero
            exp >>= 1; //shift the right most digit
        }
        return result;
    }
}
