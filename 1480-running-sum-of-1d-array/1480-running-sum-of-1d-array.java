class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        int[] res= new int[n];
        res[0]= nums[0];
        for(int i=0; i<n-1; i++){
            res[i+1]= res[i]+ nums[i+1];
        }
        return res;
    }
}