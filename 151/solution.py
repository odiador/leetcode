class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        split = s.split()
        l = len(split)
        mid = l // 2
        for i in range(mid):
            aux = split[i]
            split[i] = split[l - i - 1]
            split[l - i - 1] = aux
        return ' '.join(split)
        