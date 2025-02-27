class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1)
            return true;
        int cant = 0;
        int nmax = 0;
        boolean left = false;
        int i = 0;
        for (; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0)
                cant++;
            else {
                nmax += (cant - (left ? 1 : 0)) / 2;
                left = true;
                cant = 0;
            }
        }
        nmax += (cant + (left ? 0 : 1)) / 2;
        return nmax >= n;
    }
}