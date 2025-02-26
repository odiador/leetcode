import java.lang.Math;

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxResult = nums[0], resMax = nums[0];
        int minResult = nums[0], resMin = nums[0];
        if (maxResult < 0)
            maxResult = 0;
        if (minResult > 0)
            minResult = 0;
        for (int i = 1; i < nums.length; i++) {
            maxResult += nums[i];
            minResult += nums[i];
            if (resMax < maxResult)
                resMax = maxResult;
            if (maxResult < 0)
                maxResult = 0;
            if (resMin > minResult)
                resMin = minResult;
            if (minResult > 0)
                minResult = 0;

        }
        resMin = Math.abs(resMin);
        resMax = Math.abs(resMax);
        return resMin > resMax ? resMin : resMax;

    }
}