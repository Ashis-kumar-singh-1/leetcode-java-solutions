class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}

// long MOD = 1000000007;
//     public double myPow(double x, int n) {
//         if(n==0){
//             return 1;
//         }
//         double half=myPow(x,n/2);
//         double ans = (half * half) % MOD;
//         if(n % 2!=0)
//             ans = (ans * x) % MOD;
//             return ans;
//     }