class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int l=0;
        int r=0;
        int maxFreq = 0;
        while(r<n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,map.get(ch));
            while(r-l+1-maxFreq >k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}