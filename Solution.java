class Solution {
    public static void main(String args[]) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    // note: int/int = int; means if we divide int by int then answer should always

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
            } else {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            temp[k] = nums2[j];
            j++;
            k++;
        }
        if (temp.length % 2 == 0) {
            int mid = temp.length / 2;
            double sum = temp[mid] + temp[mid - 1];
            double median = sum / 2;
            return median;
        } else {
            int mid = temp.length / 2;
            double median = temp[mid];
            return median;

        }

    }
}