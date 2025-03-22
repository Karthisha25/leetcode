class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set('aeiouAEIOU')  # Set of vowels for quick lookup
        s = list(s)  # Convert string to a list to modify it
        left, right = 0, len(s) - 1
        
        while left < right:
            if s[left] in vowels and s[right] in vowels:
                s[left], s[right] = s[right], s[left]  # Swap vowels
                left += 1
                right -= 1
            elif s[left] not in vowels:
                left += 1
            elif s[right] not in vowels:
                right -= 1
        
        return ''.join(s)  # Convert list back to string


        