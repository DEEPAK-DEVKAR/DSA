package LeetCode.CodingNinja.misc;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0;
        int b=1,c;

        if(n==0)
        {
            System.out.print(a);
            return;
        }

        for(int i = 2;i<=n;i++)
        {
            c= a+b;
            a = b;
            b = c;
        }

        System.out.print(b);


    }

}
