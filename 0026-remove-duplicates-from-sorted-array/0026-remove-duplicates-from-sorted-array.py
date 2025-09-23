from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1  # Start from the second element
        while i < len(nums):
            if nums[i] == nums[i - 1]:
                del nums[i]  
            else:
                i += 1  
        return len(nums)
