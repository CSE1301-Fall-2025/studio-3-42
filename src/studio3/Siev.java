import java.util.Scanner;

public class Siev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Up to what number do you want to find all the prime numbers?");
        int n = scan.nextInt();
        boolean[] numberSet = new boolean[n + 1];

        // initialize
        for (int i = 2; i <= n; i++) {
            numberSet[i] = true;
        }

        // sieve
        for (int j = 2; j * j <= n; j++) {
            if (numberSet[j]) {
                for (int m = j * j; m <= n; m += j) {
                    numberSet[m] = false;
                }
            }
        }

        // print primes
        boolean first = true;
        for (int p = 2; p <= n; p++) {
            if (numberSet[p]) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(p);
                first = false;
            }
        }
    }
}
