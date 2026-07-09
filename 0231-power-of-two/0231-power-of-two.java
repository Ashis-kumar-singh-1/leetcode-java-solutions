class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=1;i<=100;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        if(Math.pow(2,0)==n){
                return true;
        }
        return false;
    }
}