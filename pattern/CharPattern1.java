package LeetCode.CodingNinja.pattern;

import java.util.Scanner;

public class CharPattern1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=1;i<=num;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print((char)('A'+num-i+j-1));

            }

            System.out.println();
        }
    }
}
