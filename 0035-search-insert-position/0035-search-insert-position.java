class Solution {
    public int searchInsert(int[] nums, int target) {
        long low=0;
        long high= nums.length-1;
        long ans= nums.length;
        while(low<=high){
            long mid=(low+high)/2;
            if(target>nums[(int)mid]){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return (int)ans;
    }
}