class Solution:
    def firstUniqChar(self, s: str) -> int:
        n=len(s)
        d={}
        for char in s:
            if char in d:
                d[char]+=1
            else:
                d[char]=1
        for i in range(n):
            if d[s[i]] ==1:
                return i
        return -1


