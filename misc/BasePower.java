package LeetCode.CodingNinja;

public class BasePower {

    static int power(int x, int y)
    {
        int result = 1;

        while (y > 0)
        {

            // y is even
            if (y % 2 == 0)
            {
                x = x * x;
                y = y / 2;
            }

            // y isn't even
            else
            {
                result = result * x;
                y = y - 1;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;

        System.out.println(power(x, y));
    }
}
