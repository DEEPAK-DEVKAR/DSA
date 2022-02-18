package LeetCode.CodingNinja.pattern;

import java.util.Scanner;

public class StarPattern3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i-j+1);
            }
            System.out.println();
        }

    }
}
