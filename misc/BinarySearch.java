package LeetCode;

import java.util.Scanner;

public class BinarySearch {

    static int binary_search(int arr[],int n,int key){

        int s = 0;
        int e = n-1;

        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid] == key)
            {
                return mid;
            }else if(arr[mid] < key )
            {
                s= mid +1;
            }
            else
            {
                e = mid -1;
            }
        }
        return -1;

    }
    public static void main(String[] args){

        int arr[] = {10,20,30,40,45,60,70,89};
        int n = arr.length;
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();

        int index = binary_search(arr,n,key);
        if(index!=-1){
            System.out.println(key  + " is present at index " +  index);
        }
        else{
            System.out.println(key  + " is NOT Found!");
        }


    }
}
