class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int votes = 0;

        for (int x : nums) {
            if (votes == 0) {
                candidate = x;
            }

            if (x == candidate) {
                votes++;
            } else {
                votes--;
            }
        }

        return candidate;
    }
}