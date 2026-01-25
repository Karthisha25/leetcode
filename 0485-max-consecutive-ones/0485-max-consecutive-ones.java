class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int l=0;
        int maxcnt=0;
        for(int r=0; r<n; r++){
            if(nums[r]==0){
                l= r+1;
            }
            maxcnt= Math.max(maxcnt, r-l+1);
        }
        return maxcnt;
        
    }
}