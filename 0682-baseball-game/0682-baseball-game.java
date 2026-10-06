class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                st.push(st.peek() * 2);
            }else if(op.equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                st.push(first + second);
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.peek();
            st.pop();
        }
        return ans;
    }
}