import java.util.Arrays;
public class swaping_values_in_arr {
    public static void main(String[] args) {
        int []arr={1,3,23,9,18};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));    }
    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];    // Store the value from the first index
        arr[index1] = arr[index2]; // Put the second value into the first index's spot
        arr[index2] = temp;        // Put the stored original value into the second index's spot
    }
}