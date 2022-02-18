package LeetCode;

public class largestSubarraySum2 {

    static int largestSubarraySum2(int[] arr, int n){

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i = 1;i<n;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        int largestSum = prefix[0];

        for(int i=1;i<n;i++)
        {
            if(prefix[i] > largestSum)
            {
                largestSum = prefix[i];
            }
        }
        return largestSum;
    }

    static int largestSubarraySum3(int[] arr, int n){

        //Prefix Sums
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //largest sum login
        int largest_sum = 0;

        for(int i=0;i<n;i++){
            for(int j=i; j<n; j++){
                int subarraySum = i>0 ? prefix[j] - prefix[i-1] : prefix[j];
                //put a check is subarraySum > largest_sum
                largest_sum = Math.max(largest_sum,subarraySum);

            }
        }
        return largest_sum;
    }

    public static void main(String[] args){
        //Array Containing
        //int arr[] = {10,20,30,40,50,60};
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        System.out.println(largestSubarraySum3(arr, n));
    }
}
