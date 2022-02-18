package LeetCode;

public class LinearSearch {

    public static void main(String[] args) {

        int[] a = {1,2,4,6,76,54,66};
        System.out.println(liniearSearch(a , 14));

    }

    static boolean liniearSearch(int arr[], int n)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==n)
            {
                return true;
            }
        }
        return false;
    }
}
