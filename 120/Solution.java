import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = triangle.get(0).get(0);
        if (triangle.size() == 1)
            return sum;
        int[][] dp = new int[200][200];

        for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++)
            dp[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);

        for (int i = triangle.size() - 2; i >= 0; i--)
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int min = (dp[i + 1][j] < dp[i + 1][j + 1] ? dp[i + 1][j] : dp[i + 1][j + 1]);
                dp[i][j] = triangle.get(i).get(j)+min;
            }

        return dp[0][0];
    }
}