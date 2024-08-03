import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { 13, 4, -6, -7, -15, -1, 0, -1, 0, -12, -12, 9, 3, -14, -2, -5, -6, 7, 8, 2, -4, 6, -5, -10, -4,
                -9, -14, -14, 12, -13, -7, 3, 7, 2, 11, 7, 9, -4, 13, -6, -1, -14, -12, 9, 9, -6, -11, 10, -14, 13, -2,
                -11, -4, 8, -6, 0, 7, -12, 1, 4, 12, 9, 14, -4, -3, 11, 10, -9, -8, 8, 0, -1, 1, 3, -15, -12, 4, 12, 13,
                6, 10, -4, 10, 13, 12, 12, -2, 4, 7, 7, -15, -4, 1, -15, 8, 5, 3, 3, 11, 2, -11, -12, -14, 5, -1, 9, 0,
                -12, 6, -1, 1, 1, 2, -3 };
        System.out.println(threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> innerList = new ArrayList();
        // int i = 0 , j = 0, k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    for (int k = 0; k < nums.length; k++) {
                        if (k == i && k == j) {
                            continue;
                        } else if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k) {
                            innerList.add(nums[i]);
                            innerList.add(nums[j]);
                            innerList.add(nums[k]);
                            Set<Integer> set1 = new HashSet<>(innerList);
                            boolean flag = false;
                            for (List<Integer> l : list) {
                                Set<Integer> set2 = new HashSet<>(l);
                                if (set1.equals(set2)) {
                                    flag = true;
                                    break;
                                }
                            }
                            if (!flag) {
                                list.add(innerList);
                            }
                            innerList = new ArrayList<>();
                        }

                    }
                }
            }
        }
        return list;
    }
}
