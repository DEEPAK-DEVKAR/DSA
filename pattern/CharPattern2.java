package LeetCode.CodingNinja.pattern;

import java.util.Scanner;

public class CharPattern2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int i = 1;
        while(i<=num)
        {
            int j=1;

            while(j<=i)
            {
                System.out.print((char)('A'+i+j-2));
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
