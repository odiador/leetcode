class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        n = len(sentence)
        if sentence[0] != sentence[n - 1]:
            return False
        for i in range(n - 1):
            if sentence[i] == " ":
                if sentence[i - 1] != sentence[i + 1]:
                    return False
        return True