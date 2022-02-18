package LeetCode.CodingNinja;

public class PrimeNumberRange {

    static void isPrime(int n) {

        System.out.println(Math.sqrt(n));
        int a, b, i, j,flag;

        for (i = 3; i <= n; i = i + 2) {
            flag = 1;

            // WE TRAVERSE TILL SQUARE ROOT OF j only.
            // (LARGEST POSSIBLE VALUE OF A PRIME FACTOR)
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
       // System.out.println(isPrime(11));
        isPrime(17);
    }
}
