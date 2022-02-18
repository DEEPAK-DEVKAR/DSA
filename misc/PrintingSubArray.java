package LeetCode;

public class PrintingSubArray {


    public static void printSubArray(int[] arr, int n)
    {
        int largestValue = 0;
        int sum = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        sum = sum + arr[k];

                        largestValue = Math.max(largestValue,sum);
                        //System.out.print(arr[k] + " ,");
                    }
                    System.out.print(sum);

                    sum = 0;

                    System.out.println( );
                }

            }

        System.out.println("largest value is " + largestValue);
    }
    public static void main(String[] args){
        //Array Containing
        //int arr[] = {10,20,30,40,50,60};
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        printSubArray(arr, n);
    }
}
