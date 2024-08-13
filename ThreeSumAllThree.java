import java.util.*;

public class ThreeSumAllThree {

    public static void main(String[] args) {
        int[] arr = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 1, 1, 1, 2, 2, 2 };
        int target = 0;
        System.out.println(threeSumO(arr, target));
        int max = Integer.MIN_VALUE;
        System.out.println(max);
    }

    // brute force O(N^3)
    public static List<List<Integer>> threeSum(int[] arr, int target) {
        Set<List<Integer>> list = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == target) {
                        int[] nums = new int[] { arr[i], arr[j], arr[k] };
                        Arrays.sort(nums);
                        List<Integer> l = new ArrayList<>();
                        for (int n : nums) {
                            l.add(n);
                        }
                        list.add(l);
                    }
                }
            }
        }
        List<List<Integer>> list1 = new ArrayList<>(list);
        return list1;
    }

    // better approach O(N^2 * logN)
    public static List<List<Integer>> threeSumB(int[] arr, int target) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                int sum = -(arr[i] + arr[j]);
                if (temp.contains(sum)) {
                    int[] nums = new int[] { arr[i], arr[j], sum };
                    Arrays.sort(nums);
                    List<Integer> l = new ArrayList<>();
                    for (int element : nums) {
                        l.add(element);
                    }
                    result.add(l);
                }
                temp.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(result);
        return ans;
    }

    // optimal approach
    public static List<List<Integer>> threeSumO(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;
                    while (start < end && arr[start] == arr[start - 1])
                        start++;
                    while (end < arr.length - 1 && arr[end] == arr[end + 1])
                        end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return list;
    }

}
