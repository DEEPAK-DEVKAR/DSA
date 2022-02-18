package LeetCode;

public class ReverseArray {
//time complexity is O(N) and space is O(1)

    static void reverseArray(int arr[],int n){

        int s = 0;
        int e = n-1;

        while(s<=e)
        {
            int val = arr[e];
            arr[e] = arr[s];
            arr[s] = val;
            s++;
            e--;
        }
    }
    public static void main(String[] args){

        int arr[] = {10,20,30,45,60,80};
        int n = arr.length;
        //Print the Output
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();


        reverseArray(arr,n);

        //Print the Output
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
