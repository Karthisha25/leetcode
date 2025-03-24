class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        store = {}

        for i,c in enumerate(nums):
            num = target - c
            if num in store:
                return i,store[num]
            else:
                store[c] = i
        return