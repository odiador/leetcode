import java.util.ArrayList;

// Time limit (142 / 151 testcases passed)
class Timelimit {
    class Solution {
        public int numOfSubarrays(int[] arr) {
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1)
                    l.add(i);
            }
            int ls = l.size();
            int result = 0;
            int max = l.size();
            int i = 0;
            while (max > 0) {
                for (int j = 0; j < max; j++) {
                    int left = 1;
                    int right = 1;
                    int vleft = l.get(j);
                    if (vleft != 0) {
                        if (j == 0)
                            left = vleft + 1;
                        else
                            left = vleft - l.get(j - 1);
                    }
                    int vright = l.get(j + i);
                    if (j + i < ls - 1) {
                        right = l.get(j + i + 1) - vright;
                    } else {
                        right = arr.length - vright;
                    }
                    result += left * right;
                }
                max -= 2;
                i += 2;
            }
            return result;
        }
    }
}