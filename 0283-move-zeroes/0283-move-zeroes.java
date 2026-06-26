// class Solution {
//     public void moveZeroes(int[] nums) {
//         int i = 0;
//         for(int j=0;i<nums.length;j++){
//             if(nums[j]!=0){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//             }
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}

//         int n=nums.length;
//         Arrays.sort(nums);
//         int count=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==0){
//                 count++;
//             }
//         }
//         // for(int i=0;i<count;i++){
//             reverse(nums,0,n-1);
//         // }
//     }
//     public void reverse(int []nums,int start,int end){
//         while(start<end){
//             int temp=nums[start];
//             nums[start]=nums[end];
//             nums[end]=temp;

//             start++;
//             end--;
//         }
//     }
// }
 // int result[]=new int[nums.length];
        // Arrays.sort(nums);
        // int j=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         result[i]=nums[i];
        //         // continue;
        //     }
        //         result[i]=nums[i];
        // }