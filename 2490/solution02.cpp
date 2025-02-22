#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isCircularSentence(string sentence) {
        int n = sentence.length();
        bool res = true;
        if (sentence[0] != sentence[n - 1]) {
            res = false;
        }
        for (int i = 0; i < n - 1 && res; i++) {
            if (sentence[i] == ' ') {
                if (sentence[i - 1] != sentence[i + 1]) {
                    res = false;
                }
            }
        }
        return res;
    }
};