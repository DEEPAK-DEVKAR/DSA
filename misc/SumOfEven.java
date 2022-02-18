package LeetCode.CodingNinja;

public class SumOfEven {

    static int sumOfEven(int n)
    {
        int sum = 0;
        for(int i = 2;i<=n;i++)
        {
            if(i%2==0)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfEven(10));
    }
}
