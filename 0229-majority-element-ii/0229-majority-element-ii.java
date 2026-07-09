class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (result.contains(nums[i]))
                continue;
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count >nums.length/3){
                result.add(nums[i]);
            }
        }
            return result;
    }
}