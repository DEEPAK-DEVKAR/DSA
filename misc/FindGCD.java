package LeetCode.CodingNinja;

public class FindGCD {

    static int findGCD(int a, int b)
    {
        if(a==b)
            return a;

        if(a>b)
            return findGCD(a-b,b);
            return findGCD(a,b-a);
    }
    public static void main(String[] args) {
        System.out.println(findGCD(10,15));
    }
}
