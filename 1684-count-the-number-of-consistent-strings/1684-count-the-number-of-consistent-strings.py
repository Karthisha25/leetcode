class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowed= set(allowed)
        count=0
        for word in words:
            consistent= True
            for letter in word:
                if letter not in allowed:
                    consistent = False
                    break
            if consistent:
                count+=1
        return count
            
           