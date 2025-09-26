public class Maxval_in_arr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {   // return type should be int
        int maxVal = arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        }return maxVal;
    }
}
