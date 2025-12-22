class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = k - 1;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxsum = sum;
        while (r < n - 1) {
            sum += nums[r + 1]; 
            sum -= nums[l];     
            l++;
            r++;
            maxsum = Math.max(maxsum, sum);
        }
        return (double) maxsum / k;
    }
}
