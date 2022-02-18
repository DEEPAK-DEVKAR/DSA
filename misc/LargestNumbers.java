package LeetCode.CodingNinja;

public class LargestNumbers {
    static int largest(int arr[])
    {
        int largest = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(largest < arr[i])
            largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,100,45,60,70,89};
        System.out.println(largest(arr));
    }
}
