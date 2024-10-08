public class StackAndQueue{
public static void main(String[] args){
}
  //check is this valid parenthesis
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

  //how to make valid parenthesis
  public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '(' ) {
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                    
                }else if(ch == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }   
                }else if(ch == ']'){
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }   
                }
            }
        }
        return stack.size();
        
    }
}
