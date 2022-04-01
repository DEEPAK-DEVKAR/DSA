package LeetCode.CodingNinja.array;

public class LinearSearchInArray {

    public static int linearSearch(int arr[], int x) {

        int index = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }

        return index;
    }
}
