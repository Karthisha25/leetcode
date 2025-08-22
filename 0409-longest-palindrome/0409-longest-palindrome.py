class Solution:
    def longestPalindrome(self, s: str) -> int:
        d = {}
        for ch in s:
            if ch in d:
                d[ch] += 1
            else:
                d[ch] = 1

        length = 0
        op = False

        for count in d.values():
            if count % 2 == 0:
                length += count
            else:
                length += count - 1
                op = True

        if op:
            length += 1

        return length
