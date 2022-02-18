package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class K_Rotate {
    static ArrayList<Integer> kRotate(ArrayList<Integer> a, int k)
    {
        ArrayList<Integer> v = new ArrayList<>();
        int n = a.size();
        k=k%n;// to maintain always k is less than length of array

        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                v.add(a.get(n+i-k));
            }
            else
            {
                v.add(a.get(i-k));
            }
        }

        return v;
    }

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,9));

        System.out.println(kRotate(list, 10));
    }
}
