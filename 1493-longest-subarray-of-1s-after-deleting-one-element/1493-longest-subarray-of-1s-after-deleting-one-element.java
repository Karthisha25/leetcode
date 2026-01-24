class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int zcnt=0;
        int maxlen=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==0){
                zcnt++;
            }
            while(zcnt>1){
                if(nums[l]==0){
                    zcnt--;
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l);
        }
        return maxlen;
    }
}