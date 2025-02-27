import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }
        Boolean[] ans = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            ans[i] = candies[i] + extraCandies >= max;
        }
        return Arrays.asList(ans);
    }
}