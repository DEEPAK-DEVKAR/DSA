package LeetCode;

public class SortedPairSum {

    static Pair closestSum(int[] arr, int x){
        int pos1 = 0, pos2 = 0;
        int size = arr.length;
        int start = 0;
        int last = size-1;
        int diff = Integer.MAX_VALUE;

        while (last > start)
        {
            if (Math.abs(arr[start] + arr[last] - x) < diff)
            {
                pos1 = start;
                pos2 = last;
                diff = Math.abs(arr[start] + arr[last] - x);
            }

            if (arr[start] + arr[last] > x)
                last--;
            else
                start++;
        }

        return new Pair(arr[pos1], arr[pos2]);
    }

    public static void main(String[] args){
        //Array Containing
        int arr[] = {10,22,28,29,30,40};
       // int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = 54;

        System.out.println(closestSum(arr, n));
    }
}

class Pair{
    public int a;

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
