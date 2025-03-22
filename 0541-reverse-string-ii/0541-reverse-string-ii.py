class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        new=''
        f=1
        for i in range(0,len(s),k):
            if f==1:
                new+=(s[i:i+k])[::-1]
                f=0
            else:
                new+=s[i:i+k]
                f=1
        return new
        