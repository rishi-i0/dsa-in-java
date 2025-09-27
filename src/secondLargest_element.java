class Solution {
    public int getLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int largest = getLargest(arr);
        int secondL = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest && arr[i] > secondL) {
                secondL = arr[i];
            }
        }

        return secondL;
    }


    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        Solution ob = new Solution();
        System.out.println("Second largest element : " + ob.getSecondLargest(arr));
    }
}