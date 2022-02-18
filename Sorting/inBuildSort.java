package LeetCode.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class inBuildSort {

    public static void main(String[] args){

        Integer arr[] = {10,9,8,6,5,4,3,2,11,16,8};
        int n = arr.length;

        Arrays.sort(arr, Comparator.comparingInt(a-> (int) a).reversed());


        for(int k: arr){
            System.out.println(k);
        }


    }

}

 class com implements Comparator<Integer> {

     @Override
     public int compare(Integer o1, Integer o2) {
         return o2 - o1;
     }
 }
