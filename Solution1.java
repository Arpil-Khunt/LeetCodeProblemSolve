class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;
        for(int i = 0; i<n-1; i++){
            int a = nums.get(i);
            for(int j = i+1; j<n; j++){
                if(a+nums.get(j) < target) count++;
            }
        }
        return count;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '(' ) return false;
                }else if(ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                }else if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                }
            }
        }
        return (stack.isEmpty())? true : false;
    }

}
