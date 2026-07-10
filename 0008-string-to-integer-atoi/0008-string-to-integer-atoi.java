class Solution {
    public int myAtoi(String s) {
        // Your code goes here
        int i = 0;
        int n = s.length();
        int sign = 1;
        long  num = 0;
        while(i < n && s.charAt(i)== ' '){
             i++;
        } 
            if( i < n  && s.charAt(i) == '-'){
                sign = -1;
                i++;
            } else if(i < n  && s.charAt(i) == '+'){
                i++;
            }
        
        while(i < n && Character.isDigit(s.charAt(i))){
            num = num*10 + (s.charAt(i) - '0');
             if (sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        } 
        
        return (int)(sign*num);
    }
}