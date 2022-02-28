package LeetCode.CodingNinja.misc;

import java.util.Scanner;

public class CheckSequenceNumber2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int prev = scan.nextInt();

        int count =2, current;
        boolean isDec = true;

        while(count<=n)
        {
            current = scan.nextInt();
            count++;
            if(current==prev)
            {
                System.out.println("false");
                return;
            }
            if(current < prev)
            {
                if(isDec==false)
                {
                    System.out.println("false");
                    return;
                }
            }
            else
            {
                if(isDec==true)
                {
                    isDec = false;
                }
            }
            prev = current;
        }
        System.out.println("true");
    }
}
