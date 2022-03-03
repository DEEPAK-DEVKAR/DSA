package LeetCode.CodingNinja.misc;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int step = scan.nextInt();
        int cel = 0;

        for(int i=start;i<=end;)
        {
            cel = (i-32)*5/9;
            System.out.println(i+" "+cel);
            i+=step;
        }

    }
}
