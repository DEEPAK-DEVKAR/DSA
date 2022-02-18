package LeetCode.Sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubble_sort(int a[], int n) {
        boolean swapped;
        for(int i=1;i<=n-1;i++)
        {
            swapped = false;
            for(int j=0;j<=n-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    System.out.println("inside inner");
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }


    }


    public static void main(String[] args) {
        int arr[] = {1,3,5,2,9};
        int n = arr.length;


        bubble_sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
