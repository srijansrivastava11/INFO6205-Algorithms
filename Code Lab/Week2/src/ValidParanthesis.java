
public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.add(')');
            }
            else if(s.charAt(i) == '{') {
                st.add('}');
            }
            else if(s.charAt(i) == '[') {
                st.add(']');
            }
            else {
                if(st.empty() || s.charAt(i) != st.peek()) {
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }

        if(st.empty()) {
            return true;
        }

        return false;
    }
}