class Solution {
        String ans = "";
    private void expand(String s , int left , int right){
        while(left >=0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)){
            if(right-left+1 > ans.length()){
                ans = s.substring(left , right+1);
            }
            left--;
            right++;
        }
    }
    public String longestPalindrome(String s) {
        for(int i = 0; i<s.length(); i++){
            //odd
            expand(s, i , i);
            //even
            expand(s, i , i+1);
        }
        return ans;
    }
}