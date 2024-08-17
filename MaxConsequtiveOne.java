public class MaxConsequtiveOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxPre = 0;
        int maxCurr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxCurr++;
            }
            maxPre = Math.max(maxPre, maxCurr);
            if (nums[i] != 1) {
                maxCurr = 0;
            }
        }
        return maxPre;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
