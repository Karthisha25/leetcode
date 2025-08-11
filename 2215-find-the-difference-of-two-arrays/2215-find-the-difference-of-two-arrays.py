class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        answer = [[], []]
        added_nums1 = []
        added_nums2 = []
        for num in nums1:
            if num not in nums2 and num not in added_nums1:
                answer[0].append(num)
                added_nums1.append(num)
        for num in nums2:
            if num not in nums1 and num not in added_nums2:
                answer[1].append(num)
                added_nums2.append(num)
        return answer

