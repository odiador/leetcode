import java.util.Arrays;

class Solution {
    public boolean canSortArray(int[] nums) {
        if (nums.length == 1)
            return true;
        {
            boolean sorted = true;
            for (int i = 0; sorted && i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sorted = false;
                }
            }
            if (sorted)
                return true;
        }
        int cnt = Integer.bitCount(nums[0]);
        int fromI = 0;
        for (int i = 1; i < nums.length; i++) {
            int bCnt = Integer.bitCount(nums[i]);
            if (cnt != bCnt) {
                System.out.println(Arrays.toString(nums));
                System.out.println("Arrays.sort(" + nums + ", " + fromI + ", " + (i) + ")");
                Arrays.sort(nums, fromI, i );
                System.out.println(Arrays.toString(nums));
                cnt = bCnt;
                fromI = i;
            }
        }
        Arrays.sort(nums, fromI, nums.length);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;

    }

}