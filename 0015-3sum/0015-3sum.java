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


class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        // Stores unique triplets
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            int target = -nums[i];

            for (int j = i + 1; j < n; j++) {

                int third = target - nums[j];

                if (set.contains(third)) {

                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(third);

                    // Sort so duplicates become identical
                    Collections.sort(triplet);

                    uniqueTriplets.add(triplet);
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }
}