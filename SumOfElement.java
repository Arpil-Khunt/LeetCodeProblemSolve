public class SumOfElement {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 5, 9 };
        runningSum(nums);
    }

    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
