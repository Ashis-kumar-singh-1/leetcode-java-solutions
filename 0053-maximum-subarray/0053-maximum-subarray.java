class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum += nums[i];
        // }
        // return sum;
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j = i ;j<nums.length;j++){
    //             int sum =0;
    //             for(int k=i ; k<=j;k++){
    //                 sum += nums[k];
    //             }
    //                 max = Math.max(sum,max);
    //         }
    //     }
    //     return  max;
    // }

        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum =0;
        //     for(int j = i ;j<nums.length;j++){
        //             sum += nums[j];                
        //             max = Math.max(sum,max);
        //     }
        // }
        // return  max;

        int max =nums[0];
        int currentMax=nums[0];
        for (int i =1;i<nums.length;i++){
            currentMax = Math.max(nums[i],currentMax+nums[i]);
            max= Math.max(max,currentMax);
        }
        return max;
    }
}