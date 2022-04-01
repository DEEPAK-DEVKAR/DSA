package LeetCode.CodingNinja.array;
/*
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
        Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
*/
public class ArrangeNumbersInArray {

    public static void arrange(int[] arr, int n) {

        int startIndex = 0;
        int endIndex = n-1;
        int val = 1;
        while(startIndex < endIndex)
        {
            arr[startIndex] = val;
            val++;

            arr[endIndex] = val;
            val++;

            startIndex++;
            endIndex--;
            if(startIndex == endIndex)
                arr[startIndex] = val;


        }
    }
}
