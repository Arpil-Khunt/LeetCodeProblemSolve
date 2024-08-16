public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        boolean[] visit = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            visit[nums[i]] = true;
        }
        int i = 0;
        while (i < visit.length && visit[i]) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 1, 5 };
        System.out.println(missingNumber(arr));
    }
}
