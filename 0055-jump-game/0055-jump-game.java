class Solution {
    public boolean canJump(int[] nums) {
        int start = 0;
        // int end = nums.length()-1;
        for(int i = 0;i<nums.length;i++){
            if(start<i){
                return false;
            }
            start = Math.max(start,i+nums[i]);
        }
        return true;
    }
}
