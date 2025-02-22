class Solution {

    public int tribonacci(int n) {
        int[] map = new int[38];
        map[1] = 1;
        map[2] = 1;
        // t 0 = 0
        // t1 = 1
        // t2 = 1
        // t3 = 2
        // t4 = 4
        for (int i = 3; i <= n; i++) {
            map[i] = map[i - 1] + map[i - 2] + map[i - 3];
        }
        return map[n];
    }
}