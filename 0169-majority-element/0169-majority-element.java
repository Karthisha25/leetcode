class Solution {
    public int majorityElement(int[] nums) {
        int number=0;
        int cnt=0;
        for(int i=0; i<nums.length; i++){
            if(cnt==0){
                number=nums[i];
            }
            if(number==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return number;
    }
}