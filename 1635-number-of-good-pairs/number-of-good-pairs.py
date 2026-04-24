class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        unum = set(nums)
        counter = [nums.count(n) for n in unum]
        return sum([n*(n-1)//2 for n in counter])