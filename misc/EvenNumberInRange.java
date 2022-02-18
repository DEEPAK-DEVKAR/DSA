package LeetCode.CodingNinja;

public class EvenNumberInRange {

    static void evenNumberInRange(int n)
    {
        for(int i = 2;i<=n;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        evenNumberInRange(10);
    }
}


