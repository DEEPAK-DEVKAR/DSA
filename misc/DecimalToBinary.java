package LeetCode.CodingNinja.misc;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ans = 0;
        int pv = 1;

        while(n>0)
        {
            ans = ans + (n%2*pv); //multiply with place value to get it at first place

            pv*=10;
            n = n/2;
        }

        System.out.print(ans);
    }
}
