class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        
        num = 0
        for i in range(0,n):
            num = num * 10 + digits[i]
        
        num = num + 1
        
        return [int(i) for i in str(num)]