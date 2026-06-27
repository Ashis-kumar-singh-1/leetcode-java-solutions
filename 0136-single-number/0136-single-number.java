class Solution {
    public int singleNumber(int[] nums) {
        // int key = 0;
        for(int i =0;i<nums.length;i++){
            int count = 0;
            // int temp=nums[i];
            // nums[i]=key;
            // key=temp;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                    }
                }
                if(count==1){
                    return nums[i];
                    }
        }
        return -1;
    }
}