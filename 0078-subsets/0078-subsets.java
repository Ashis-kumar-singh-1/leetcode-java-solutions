class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans =new ArrayList<>();
        getAllSubsets(nums,ans,0,result);
        return result;
    }
    public void getAllSubsets(int []nums, List<Integer> ans,int i,List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        getAllSubsets(nums,ans,i+1,result);
        ans.removeLast();
        getAllSubsets(nums,ans,i+1,result);

    }
}