class Solution:
    def isBalanced(self, num: str) -> bool:
        esum, osum = 0, 0
        for i, d in enumerate(num):
            if i % 2 == 0:
                esum += int(d)
            else:
                osum += int(d)
        return esum == osum

        