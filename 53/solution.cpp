using namespace std;
#include <vector>

class Solution {
    public:
        int maxSubArray(vector<int>& nums) {
            int sz = nums.size(), max = nums[0];
            int sum = max < 0 ? 0 : max;
            for (int i = 1; i < sz; i++) {
                sum += nums[i];
                max = sum > max ? sum : max;
                sum = sum < 0 ? 0 : sum;
            }
            return max;
        }
    };