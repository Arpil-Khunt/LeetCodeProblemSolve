public class CombinationSum{
  public static void main(String args[]){
    List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int[] nums = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        int start = 0;
        combinationSum(res,curr,nums,start,target);
        System.out.println(res);
  }
  public static void combinationSum(List<List<Integer>> res, List<Integer> curr, int[] nums, int start,int target){
        if(start == nums.length){
            if(target == 0){
                res.add(new ArrayList<>(curr));
                return;
            }
            return;
        }
      if(nums[start]<=target){
          curr.add(nums[start]);
          combinationSum(res,curr,nums,start,target-nums[start]);
          curr.remove(curr.size()-1);
      }
      combinationSum(res,curr,nums,start+1,target);
    }
}
