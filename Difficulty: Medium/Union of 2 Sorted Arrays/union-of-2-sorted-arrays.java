import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a1[], int b[]) {
         int n = a1.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();

        while (i < n && j < m) {
            if (a1[i] <= b[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a1[i])
                    Union.add(a1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j])
                    Union.add(b[j]);
                j++;
            }
        }

        while (i < n) {
            if (Union.get(Union.size() - 1) != a1[i])
                Union.add(a1[i]);
            i++;
        }

        while (j < m) {
            if (Union.get(Union.size() - 1) != b[j])
                Union.add(b[j]);
            j++;
        }

        return Union;
    }

    public static void main(String args[]) {
        int n = 10;
        int m = 7;
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = {2,3,4,4,5,11,12};

        ArrayList<Integer> Union = findUnion(a, b);

        System.out.println("Union of Two arrays is:");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
