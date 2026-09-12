class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            String ch = tokens[i];
            if(ch.equals("+")||
               ch.equals("-")||
               ch.equals("*")||
               ch.equals("/")){

                int b = st.pop();
                int a = st.pop();

                int res = 0;
                if(ch.equals("+")){
                    res = a + b;
                }else if(ch.equals("-")){
                    res = a-b;
                }else if(ch.equals("*")){
                    res = a * b;
                }else{
                    res =  a / b;
                }
                st.push(res);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}