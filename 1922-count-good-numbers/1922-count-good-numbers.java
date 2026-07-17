class Solution {

    long MOD = 1000000007;

    public long power(long base, long exp) {
        // return Math.pow(base,exp);
        if(exp==0){
            return 1;
        }
        long half=power(base,exp/2);
        long ans = (half * half) % MOD;
        if(exp % 2!=0)
            ans = (ans * base) % MOD;
            return ans;
        
    }
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long ans = (power(5,even)*power(4,odd)) % MOD;;
        return (int)ans;
    }   
}