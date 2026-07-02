class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[]=new int[nums.length];
        int neg=0;
        int pos=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[neg]=nums[i];
                neg += 2;
            }else{
                result[pos]=nums[i];
                pos += 2;
            }
        } 
        return result;  
    }
}