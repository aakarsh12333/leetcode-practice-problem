class Solution {
    public int countDigits(long n) {
        if (n > -10 && n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }
}