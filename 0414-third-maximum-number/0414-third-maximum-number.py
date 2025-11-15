class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        diff=list(set(nums))
        if len(diff)<3:
            return max(diff)
        diff.sort(reverse=True)
        return diff[2]