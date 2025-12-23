class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==1){
            return 0;
        }
        int l=0;
        int r=k-1;
        int mini=Integer.MAX_VALUE;
        while(r<nums.length){
            int diff= nums[r]- nums[l];
            mini= Math.min(mini, diff); 
            l++;
            r++;
        }
        return mini;


    }
}