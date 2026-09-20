class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int[] result = new int[n];

        for(int i = 0; i < nums1.length; i++) {

            int ans = -1;

            for(int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]) {

                    for(int k = j + 1; k < nums2.length; k++) {

                        if(nums2[k] > nums2[j]) {
                            ans = nums2[k];
                            break;
                        }
                    }

                    break;
                }
            }

            result[i] = ans;
        }

        return result;
    }
}