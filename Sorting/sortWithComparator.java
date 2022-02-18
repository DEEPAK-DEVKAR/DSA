package LeetCode.Sorting;

import java.sql.SQLOutput;
import java.util.*;

public class sortWithComparator {


   static ArrayList<Integer> sortingWithComparator(ArrayList<Integer> list, boolean flag){

       if(flag)
           Collections.sort(list);
       else
           Collections.sort(list,Collections.reverseOrder());

       return list;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,10,2,15));
        System.out.println(sortingWithComparator(list,false));

    }
}
