package LeetCode.CodingNinja;

import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basic = scan.nextInt();
        char grade = scan.next().charAt(0);
        System.out.println(Math.ceil(basic*(20/100)));
        System.out.println(Math.ceil(83.8));
        int hra = (int) Math.ceil(basic*20/100);
        int da = (int) Math.round(basic*0.5);
        int pf = Math.round(basic*11/100);
        int allowns = 0;

        if(grade=='A')
        {
            allowns = 1700;
            //System.out.print("hi");
            System.out.print(basic+hra+da+allowns-pf);

        }else if(grade=='B')
        {
            allowns = 1500;
            System.out.print(basic+hra+da+allowns-pf);
        }else
        {
            allowns = 1300;
            System.out.print(basic+hra+da+allowns-pf);
        }

    }
}
