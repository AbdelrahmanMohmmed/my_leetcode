class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        result = int(dividend / divisor)
        
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        if result > INT_MAX:
            return INT_MAX
        if result < INT_MIN:
            return INT_MIN
        
        return result