from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        combined = nums1[:m] + nums2
        combined.sort()
        nums1[:len(combined)] = combined
        for i in range(len(combined), m + n):
            nums1[i] = 0
