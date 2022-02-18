package LeetCode.CodingNinja;

import java.util.Arrays;

public class LargestNumbers2 {
    static int largest(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,100,45,60,70,89};
        System.out.println(largest(arr));
    }
}
