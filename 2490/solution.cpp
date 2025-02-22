#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isCircularSentence(string sentence) {
        istringstream ss(sentence);
        vector<string> words;
        string each;
        int n = 0;
        while (getline(ss, each, ' ')) {
            words.push_back(each);
            n++;
        }
        bool res = true;
        for (int i = 0; i < n - 1 && res; i++) {
            if (words[i][words[i].length() - 1] != words[i + 1][0]) {
                res = false;
            }
        }
        if (res && words[n - 1][words[n - 1].length() - 1] != words[0][0]) {
            res = false;
        }
        return res;
    }
};