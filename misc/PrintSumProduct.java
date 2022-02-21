package LeetCode.CodingNinja.misc;

import java.util.Scanner;

public class PrintSumProduct {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int sum = 0;
        int prod = 1;


        if(c==1)
        {
            for(int i=1;i<=n;i++)
            {
                sum +=i;
            }
            System.out.print(sum);
        }
        else if (c==2)
        {
            for(int i=1;i<=n;i++)
            {
                prod*=i;
            }

            System.out.print(prod);
        }
        else
        {
            System.out.print("-1");
        }

    }
}
