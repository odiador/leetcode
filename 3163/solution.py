class Solution:
    def compressedString(self, word: str) -> str:
        l = len(word)
        prev = word[0]
        result = ""
        counter = 0
        for value in word:
            if value == prev:
                counter += 1
                if counter == 9:
                    result += f"{counter}{prev}"
                    counter = 0
            else:
                if counter != 0:
                    result += f"{counter}{prev}"
                prev = value
                counter = 1
        if counter != 0:
            result += f"{counter}{prev}"
        return result