class Solution {
    public static String majorityFrequencyGroup(String s) {

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int maxCount = 0;
        int bestFreq = 0;

        for(int k = 1; k <= s.length(); k++){

            int count = 0;

            for(int i = 0; i < 26; i++){
                if(freq[i] == k){
                    count++;
                }
            }

            if(count > maxCount || (count == maxCount && k > bestFreq)){
                maxCount = count;
                bestFreq = k;
            }
        }

        String ans = "";

        for(int i = 0; i < 26; i++){
            if(freq[i] == bestFreq){
                ans += (char)(i + 'a');
            }
        }

        return ans;
    }
}