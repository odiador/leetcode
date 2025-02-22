class Solution:
    def makeFancyString(self, s: str) -> str:
        n = len(s)
        if n <= 2:
            return s
        a = s[0]
        b = s[1]
        res = s[0] + s[1]
        for i in range(2, n):
            c = s[i]
            if c != a or c != b:
                res += c
            a = b
            b = c
        return res