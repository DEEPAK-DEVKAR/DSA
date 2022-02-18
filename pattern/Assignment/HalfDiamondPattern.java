package LeetCode.CodingNinja.pattern.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HalfDiamondPattern {

    public static void main(String[] args)throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("*");

        int i = 1;

        while (i <= number) {
            System.out.print("*");
            int j = 1;
            while (j<= i) {
                System.out.print(j);
                j++;
            }
            j=j-2;
            while (j>=1)
            {
                System.out.print(j);
                j--;
            }

            System.out.println("*");
            i++;
        }

        //second half
        i = 1;
        while(i<=number-1)
        {
            System.out.print("*");

            int j = 1;
            while(j<=number-i)
            {
                System.out.print(j);
                j++;
            }
            j=j-2;
            while(j>=1)
            {
                System.out.print(j);
                j=j-1;
            }
            System.out.println("*");
            i++;

        }
        System.out.println("*");
    }
    }

