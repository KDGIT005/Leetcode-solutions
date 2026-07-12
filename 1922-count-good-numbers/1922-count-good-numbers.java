class Solution {
    public long power(long b , long p){
        long ans = 1;
        while(p>0){
            if(p%2 ==1){
                ans = (ans * b)  % MOD;
                p = p-1;
            }else{
                p = p/2;
                b = (b*b)  % MOD;
            }
        }
        return ans;
    }
       long MOD = 1000000007;
    public int countGoodNumbers(long n) {
       
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (power(5 , even) * power(4,odd)) % MOD;

        return (int) ans;  
    }
}