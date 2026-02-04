class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int x=0; x<nums.length; x++){
            if(map.containsKey(nums[x])){
                return true;
            }
            map.put(nums[x],1);
        }
        return false;
    }
}