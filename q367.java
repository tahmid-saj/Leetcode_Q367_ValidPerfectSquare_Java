class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        if (num == 1) return true;

        while (l <= r) {
            int mid = (l + r) / 2;
            double val = (num * 1.0) / (mid * 1.0);

            if (val == mid) {
                return true;
            } else if (val < mid) {
                r = mid - 1;
            } else if (val > mid) {
                l = mid + 1;
            }
        }

        return false;
    }
}
