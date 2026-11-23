class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int s = needle.length();
        if(haystack.equals(needle)) return 0;
        int l = 0;
        for(int r = s; r<=n; r++){
            if(haystack.substring(l,r).equals(needle)){
                return l;
            }else{
                l++;
            }
        }
        return -1;
    }
}