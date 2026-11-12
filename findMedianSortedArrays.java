
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        for (int i = 0; i < n; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < m; i++) {
            merged[n + i] = nums2[i];
        }

        Arrays.sort(merged);

        int total = merged.length;
        int mid = total / 2;

        if (total % 2 == 1) {
            return merged[mid];
        } else {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
    }
}
