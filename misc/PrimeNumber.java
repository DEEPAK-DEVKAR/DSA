package LeetCode.CodingNinja;

public class PrimeNumber {

    static boolean isPrime(int n)
    {

        System.out.println(Math.sqrt(n));

        if(n%2==0 )
        return false;

        for(int i =3;i<Math.sqrt(n);i=i+2)
        if(n%i==0)
        return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
