
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // Step 1: Find peak
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (mountainArr.get(m) < mountainArr.get(m + 1)) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int peak = l;

        // Step 2: Search ascending portion
        l = 0;
        r = peak;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int value = mountainArr.get(m);

            if (value == target) {
                return m;
            } else if (value < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        // Step 3: Search descending portion
        l = peak + 1;
        r = n - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int value = mountainArr.get(m);

            if (value == target) {
                return m;
            } else if (value < target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }
}
