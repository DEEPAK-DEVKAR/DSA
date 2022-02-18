package LeetCode.CodingNinja;

public class printDivisors {

    static void printDivisors(int n)
    {
        // Note that this loop runs till square root
        for (int i=2; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.print(" "+ i);

                else // Otherwise print both
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }

    public static void main(String args[])
    {
        System.out.println("The divisors of 100 are: ");
        printDivisors(100);;
    }
}
