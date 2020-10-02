
public class RemoveKdigit {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        int counter = 0;
        Stack<Character> stack = new Stack<Character>();
        while(counter < num.length()) {
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter)) {
                stack.pop();
                k--;
            }
            
            stack.push(num.charAt(counter));
            counter++;
        }
        while(k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            char currentChar = stack.pop();
            sb.append(currentChar);
        }
        sb.reverse();
        //System.out.println(sb.toString());
        
        while(sb.length()>1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
