class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.split()
        reversed_words = list(reversed(words))
        return ' '.join(reversed_words)