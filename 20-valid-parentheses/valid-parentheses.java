class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == ')') {
                if(c == ')' && !stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else if (c == '[' || c == ']') {
                if(c == ']' && !stack.isEmpty() && stack.peek().equals('[')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else if (c == '{' || c == '}') {
                if(c == '}' && !stack.isEmpty() && stack.peek().equals('{')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.size() == 0 ? true : false; 
    }
}