class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // last element is always unique
        nums[k] = nums[n - 1];
        k++;

        return k;
    }
}
