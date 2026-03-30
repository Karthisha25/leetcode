class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int p1=0;
        int p2=0;
        int maxi=0;
        for(int i=0; i<nums.length; i++){
            int rob= nums[i]+p2;
            int lef=p1;
            maxi= Math.max(rob,lef);
            p2=p1;
            p1=maxi;
        }
        return maxi;
    }
}