package LeetCode.Sorting;

import java.util.Arrays;

public class Chopsticks {

    public static int pairSticks(int[] arr, int D){

        Arrays.sort(arr);
        int res = 0;

        for(int i = 0;i<arr.length-1;i++)
        {
            if((arr[i] + arr[i+1]) <= D)
            {
                res++;
                i++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,9,1,7};
        System.out.println(pairSticks(arr,15));
    }
}
