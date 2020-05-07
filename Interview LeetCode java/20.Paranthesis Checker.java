class Solution {
    public boolean isValid(String s) {
        
/*
    01 --> Put element in stack which is (, {, [ 
    02 --> if stack is empty then return flase;
    03 --> when closing braces comes first check whether the String closing braces is balanced with stack top element opening braces
    04 --> if match then pop else return flase
    05 --> after poping all element if stack is not empty then return false
*/
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                continue;
            }
            
            if (stack.isEmpty()){
                return false;
            }
            
            if (ch == ')'){
                if (stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if (ch == '}'){
                if (stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if (ch == ']'){
                if (stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}