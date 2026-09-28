class Solution {
    public int maxDepth(String s) {
        // Your code goes here
        int dept = 0;
        int maxdepth = 0;
         for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                dept++;
                maxdepth = Math.max(maxdepth, dept);
            }else if (ch == ')'){
                dept--;
            }
        }
        return maxdepth;
    }
}