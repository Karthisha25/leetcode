class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int k=0;
        for(int i=0; i<=n-1; i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<n){
            nums[k]=0;
            k++;
        }
    }
}