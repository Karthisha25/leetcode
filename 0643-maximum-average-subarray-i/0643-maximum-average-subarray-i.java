class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int r=0; r<nums.length; r++){
            sum+=nums[r];
            if(r-l+1==k){
                maxi=Math.max(maxi, sum);
                sum-=nums[l];
                l++;   
            }
        }
        return maxi/(double)k;
    }
}