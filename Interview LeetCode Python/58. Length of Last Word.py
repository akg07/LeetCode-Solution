class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        if (s.strip):
            return len(s.strip().split(' ')[-1])
        else:
            return 0
        