package LeetCode.CodingNinja.array;

public class ReturnArraySum {

    public static int sum(int[] arr) {

        int size = arr.length;
        int sum = 0;
        for(int i=0;i<size;i++)
        {
            sum +=arr[i];
        }
        return sum;
    }
}
