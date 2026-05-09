class Solution {
    public  boolean isValid(String s) {
        if (s.length() <= 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i =0;i<s.length();i++){
        char a = s.charAt(i);
        if (a == '[' || a == '(' || a == '{'){
            stack.push(a);
        }
        else{
            if (stack.isEmpty()){
                return false;
            }
            char l = stack.pop();
            if (
            (l == '(' && a == ')') ||
            (l == '[' && a == ']') ||
            (l == '{' && a == '}')
        ) {
            // valid pair
        }else{
            return false;
        }
        }
        }
        if (stack.isEmpty()){
          return true;  
        }
        return false;
    }
}