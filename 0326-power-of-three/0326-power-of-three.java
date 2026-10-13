class Solution {
    public boolean isPowerOfThree(int n) {
        // Numbers less than or equal to 0 cannot be powers of 3
        if (n <= 0) {
            return false;
        }

        // Keep dividing by 3 while it's cleanly divisible
        while (n % 3 == 0) {
            n /= 3;
        }

        // If we reached 1, it was a power of three
        return n == 1;
    }
}