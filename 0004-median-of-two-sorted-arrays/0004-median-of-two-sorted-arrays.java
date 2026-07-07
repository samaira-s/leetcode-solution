class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) return 0;
        int[] merged = new int[nums1.length + nums2.length];
        
        int ctr1 = 0;
        int ctr2 = 0;
        int ctr3 = 0;

        while (ctr1 < nums1.length && ctr2 < nums2.length) {
            if (nums1[ctr1] <= nums2[ctr2]) {
                merged[ctr3] = nums1[ctr1];
                ctr1++;
            } else {
                merged[ctr3] = nums2[ctr2];
                ctr2++;
            }
            ctr3++;
            //System.out.println("loop1 " + ctr3 + " " + ctr1 + " " + ctr2);
        }
        while (ctr1 < nums1.length) {
            merged[ctr3] = nums1[ctr1];
            ctr1++;
            ctr3++;
            //System.out.println("loop2 " + ctr3 + " " + ctr1 + " " + ctr2);
        }
        while (ctr2 < nums2.length) {
            merged[ctr3] = nums2[ctr2];
            ctr2++;
            ctr3++;
            //System.out.println("loop3 " + ctr3 + " " + ctr1 + " " + ctr2);
        }

        if (merged.length % 2 == 0) {
            int upperMedian = merged.length / 2;
            return ((double) merged[upperMedian] + (double)(merged[upperMedian - 1])) / 2;
        } else {
            return merged[merged.length / 2];
        }
    }
}