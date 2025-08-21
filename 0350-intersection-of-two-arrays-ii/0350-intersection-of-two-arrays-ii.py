class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        count_map={}
        for num in nums1:
            if num in count_map:
                count_map[num] +=1
            else:
                count_map[num] =1
        result=[]
        for num in nums2:
            if num in count_map and count_map[num] >0:
                result.append(num)
                count_map[num] -=1
        return result