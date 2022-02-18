package LeetCode.CodingNinja;

public class Factorial {

    static void product(int n)
    {
        int prod = 1;
        for(int i=2;i<=n;i++)
        {
            prod = prod * i;

        }
        System.out.println(prod);
    }

    public static void main(String[] args) {
        product(5);
    }
}
