import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        final int MOD = 1_000_000_007;
        Arrays.sort(nums); 
        int n = nums.length;
        int[] pow2 = new int[n]; 
        pow2[0] = 1;

        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        int left = 0, right = n - 1;
        int count = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                count = (count + pow2[right - left]) % MOD; 
                left++; 
            } else {
                right--; 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 5, 6, 7};
        int target = 9;

        System.out.println("Number of valid subsequences: " + sol.numSubseq(nums, target));
    }
}