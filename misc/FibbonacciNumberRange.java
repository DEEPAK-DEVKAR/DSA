package LeetCode.CodingNinja;

public class FibbonacciNumberRange {

    static void fibbonacciNumber(int lower,int upper) {

        long curr = 1, prev = 1;

        //int n1=0,n2=1,n3=1;
        //System.out.print(n1+" "+n2+" "+n3+" ");//printing 0 and 1
        while (curr <= upper) {
            long temp = curr;

            curr = prev + curr;

            prev = temp;

            if (curr >= lower && curr <= upper) {
                System.out.print(curr+ " ");
            }


        }
    }
    public static void main(String[] args) {
        fibbonacciNumber(5,15);
    }
}
