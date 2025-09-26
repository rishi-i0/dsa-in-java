import java.util.Arrays;

public class Reverse_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 4, 2};
        System.out.println(Arrays.toString(reverse(arr))); // print array properly
    }

    static int[] reverse(int[] arr) {  // return int[] instead of int
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
