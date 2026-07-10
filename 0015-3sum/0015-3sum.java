//Approch-1
// class Solution {
//        public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Set<List<Integer>> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 for (int k = j + 1; k < nums.length; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         Collections.sort(temp);
//                         set.add(temp);
//                     }
//                 }
//             }
//         }
//         result.addAll(set);
//         return result;
//     }
// }

//Approch-2
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         // Stores unique triplets
//         Set<List<Integer>> uniqueTriplets = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             HashSet<Integer> set = new HashSet<>();
//             int target = -nums[i];
//             for (int j = i + 1; j < n; j++) {
//                 int third = target - nums[j];
//                 if (set.contains(third)) {
//                     List<Integer> triplet = new ArrayList<>();
//                     triplet.add(nums[i]);
//                     triplet.add(nums[j]);
//                     triplet.add(third);
//                     // Sort so duplicates become identical
//                     Collections.sort(triplet);

//                     uniqueTriplets.add(triplet);
//                 }

//                 set.add(nums[j]);
//             }
//         }

//         return new ArrayList<>(uniqueTriplets);
//     }
// }

//Approch-3
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum=0;
        List<List<Integer>> result= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // if i will have equal to current value and previous value then
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1,k=n-1;
            while(j<k){
                //find out the sum (Main oprations)
                sum=nums[i]+nums[j]+nums[k];
                //if negative
                if(sum>0){
                    k--;
                //if postive
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> sublist= new ArrayList<>();
                    sublist.add(nums[i]);
                    sublist.add(nums[j]);
                    sublist.add(nums[k]);
                    result.add(sublist);
                    j++;
                    k--;
                // if j will have equal to current value and previous value then
                while (j<k && nums[j]==nums[j-1]){
                    j++;
                }
                while (j < k && nums[k] == nums[k + 1]){
                    k--;
                }
                }
            }
        }
        return result;
    }
}