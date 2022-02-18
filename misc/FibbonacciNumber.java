package LeetCode.CodingNinja;

public class FibbonacciNumber {

    static boolean isPerfectSq(int n)
    {
        int s =(int) Math.sqrt(n);
        return s*s==n;
    }
    static boolean isFibo(int n)
    {


        return isPerfectSq(5*n*n + 4) || isPerfectSq(5*n*n -4);
    }
    public static void main(String[] args) {

        int a=50;
        int b=Integer.MIN_VALUE;
        if(a/0==b)
        {

            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }


        System.out.println(isFibo(9)?true:false);
    }
}
