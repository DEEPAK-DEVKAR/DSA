package LeetCode;

public class LowerBound {

    public static int lowerBound(int[] arr, int val)
    {

        int sz = arr.length;

        int l = 0, r = (sz-1);

        int answer = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] > val) {
                r = mid-1;
            }
            else {
                answer = arr[mid];
                l = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        //Array Containing
        int arr[] = {10,20,30,40,50,60,70};
        //int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        //int n = arr.length;

        System.out.println(lowerBound(arr, 70));
    }
}
