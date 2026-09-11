class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character , Integer> map1 = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            char x = s1.charAt(i);
            map1.put(x , map1.getOrDefault(x , 0)+1);
        }
        int l = 0;
        int r = s1.length();
        HashMap<Character , Integer> map2 = new HashMap<>();
            for(int i = l; i<r; i++){
                map2.put(s2.charAt(i) , map2.getOrDefault(s2.charAt(i),0)+1);
            }
            if(map1.equals(map2)) return true;
            while( r < s2.length()){
                map2.put(s2.charAt(l) , map2.get(s2.charAt(l))-1);
                if(map2.get(s2.charAt(l)) == 0) map2.remove(s2.charAt(l));
                map2.put(s2.charAt(r) , map2.getOrDefault(s2.charAt(r),0)+1);
                l++;
                r++;
                if (map1.equals(map2)) {
                return true;
            }
            }
        return false;
    }
}