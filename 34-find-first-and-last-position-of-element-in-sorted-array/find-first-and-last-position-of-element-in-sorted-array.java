class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1;
        while (low<= high) {
            int middle = low + (high - low) / 2;
            int value = nums[middle];

            if (value > target) high = middle - 1;
            else if(value < target) low = middle + 1;
            else {
                int begin = 0;
                int end = nums.length-1;
                for (int i = middle ; i > -1; i--) {
                    if (nums[i] != target) {begin = i+1;
                        break;
                };
                }

                for (int i = middle; i < nums.length; i++) {
                    if (nums[i] != target) {end = i-1;
                        break;
                };
                }
                return new int [] {begin , end};
            }
        }
        return new int[]{-1, -1};
    }
}