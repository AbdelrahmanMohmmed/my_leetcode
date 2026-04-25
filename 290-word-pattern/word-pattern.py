class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s_list = s.split()
        l = len(pattern)
        my_map = {}
        l2 = len(s_list)
        if l != l2:
            return False
        for i in range(l):
            word = my_map.get(pattern[i])
            if word:
                if word != s_list[i]:
                    return False
            else:
                if s_list[i] in my_map.values():
                    return False
                my_map[pattern[i]] = s_list[i]
        return True