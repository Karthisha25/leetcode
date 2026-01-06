class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int l=0;
        int sum=0;
        int maxsum=nums[0];
        for(int r=0; r<n; r++){
            sum+=nums[r];
            maxsum=Math.max(sum, maxsum);
        if(sum<0){
            sum=0;
            l=r+1;
        }
        }
    return maxsum;
    }
}