import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int curr = 0;
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 66, 6, 6, 7 };
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                nums[curr] = nums[i];
                curr++;
            }
        }
        int[] arr = new int[curr];
        for (int i = 0; i < curr; i++) {
            arr[i] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
