package LeetCode.Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void SelectionSort(int a[], int n) {

        for(int i=0;i<=n-2;i++)
        {
            int currentValue = a[i];
            int minPos = i;

            for(int j = i;j<=n-1;j++)
            {
                if(a[j] < a[i])
                {
                    minPos = j;
                }
            }
            int temp = a[i];
            a[i] = a[minPos];
            a[minPos] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,9,1};
        int n = arr.length;


        SelectionSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
