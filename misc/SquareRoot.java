package LeetCode.CodingNinja.misc;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i =1;
        int result = 1;

        while(result<=n)
        {
            i++;
            result = i*i;

        }
        System.out.print(i-1);

    }
}
