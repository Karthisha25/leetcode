class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int cont= target-nums[i];
            if(map.containsKey(cont)){
                return new int[] { map.get(cont), i };
            }
            map.put(nums[i],i);
        }  
        return new int[] {};
    }
}