package LeetCode.CodingNinja.pattern;

import java.util.Scanner;

public class DiamOndFinalSolution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int n1 = (num/2)+1; //3
        int n2 = num/2; //2

        int i =1;

        while(i<=n1)
        {
            int j=1;
            while(j<=n1-i)
            {
                System.out.print(" ");
                j++;
            }

            j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }

            j=1;
            while(j<=i-1)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
        i=n2;
        while(i>=1)
        {
            int j=1;
            while(j<=n2-i+1)//2
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=2*i-1)//2
            {
                System.out.print("*");
                j++;
            }


            System.out.println();
            i--;
        }
    }
}
