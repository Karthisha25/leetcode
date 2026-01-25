class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxLen = 0;

        int type1 = -1, type2 = -1;
        int count1 = 0, count2 = 0;
        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];

            if (fruit == type1) {
                count1++;
            } else if (fruit == type2) {
                count2++;
            } else if (type1 == -1) {
                type1 = fruit;
                count1 = 1;
            } else if (type2 == -1) {
                type2 = fruit;
                count2 = 1;
            } else {
                while (count1 > 0 && count2 > 0) {
                    if (fruits[left] == type1) {
                        count1--;
                    } else {
                        count2--;
                    }
                    left++;
                }
                if (count1 == 0) {
                    type1 = fruit;
                    count1 = 1;
                } else {
                    type2 = fruit;
                    count2 = 1;
                }
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
