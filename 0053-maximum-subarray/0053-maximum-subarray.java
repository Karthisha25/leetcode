class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int res=nums[0];
        int maxi= nums[0];
        for(int i=1; i<n; i++){
            maxi= Math.max(maxi+nums[i],nums[i]);
        res=Math.max(maxi, res);
        }
        return res;
    }
}