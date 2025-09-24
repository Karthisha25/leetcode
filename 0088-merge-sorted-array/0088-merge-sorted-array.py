class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        nums3 = nums1[:m] + nums2  
        nums3.sort()  
        nums1[:] = nums3  