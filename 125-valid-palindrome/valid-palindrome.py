import re
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = s.lower()
        pattern = re.compile(r'[a-z0-9]')
        result = pattern.findall(s)
        reversed_result = list(reversed(result))
        if result == reversed_result:
            return True
        return False