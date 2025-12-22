class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int l = 0;
        int r = k - 1;
        int sum = 0;
        int cnt = 0;
        int target = threshold * k;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= target) {
            cnt++;
        }
        while (r < n - 1) {
            sum += arr[r + 1];
            sum -= arr[l];
            l++;
            r++;

            if (sum >= target) {
                cnt++;
            }
        }

        return cnt;
    }
}
