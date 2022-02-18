package LeetCode.CodingNinja.pattern;

import java.util.Scanner;

public class DiamondPattern2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int m = 1;
        int n;

        while (m <= number) {
            n = 1;
            while (n<= number - m) {
                System.out.print(" ");
                n++;
            }

            n = 1;
            while (n <= m * 2 - 1) {
                System.out.print("*");
                n++;
            }
            System.out.println();

            m++;
        }

        m = number - 1;

        while (m > 0) {
            n = 1;
            while (n <= number - m) {
                System.out.print(" ");
                n++;
            }

            n = 1;
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
                n++;
            }

            System.out.println();

            m--;
        }

    }

}

