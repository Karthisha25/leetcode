from collections import Counter
from math import gcd

class Solution:
    def minAnagramLength(self, s: str) -> int:
        n = len(s)
        count = Counter(s)
        d = n // gcd(*count.values())
        for size in range(d, n // 2 + 1, d):
            if n % size != 0:
                continue
            for j in range(size, n, size):
                if sorted(s[:size]) != sorted(s[j:j+size]): break
            else:
                return size
        return n
        