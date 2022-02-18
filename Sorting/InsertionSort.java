package LeetCode.Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void bubble_sort(int a[], int n) {



        for(int i=1;i<=n-1;i++)
        {
             int currentElement = a[i];
             int prevIndex = i-1;

             while(prevIndex >= 0 && a[prevIndex] > currentElement)
             {
                 a[prevIndex+1] = a[prevIndex];
                 prevIndex = prevIndex -1;
             }

             a[prevIndex +1] = currentElement;
        }


    }


    public static void main(String[] args) {
        int arr[] = {1,3,5,2,9};
        int n = arr.length;


        bubble_sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
