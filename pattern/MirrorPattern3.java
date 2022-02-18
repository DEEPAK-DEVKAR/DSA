package LeetCode.CodingNinja.pattern;

import java.util.Scanner;

public class MirrorPattern3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n-i)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i)
            {
                System.out.print(i+j-1);
                j++;
            }
             j=1;
            int t =0;
             while(j<=i-1)
             {
                 System.out.print(2*i-2-t);
                 j++;
                 t++;

             }
            i++;
            System.out.println();
        }

    }

}

