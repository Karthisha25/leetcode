class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            if (map.containsKey(curr)) {
                int prevIndex = map.get(curr);
                if (i - prevIndex <= k) {
                    return true;
                }
            }

            // update the latest index
            map.put(curr, i);
        }

        return false;
    }
}
