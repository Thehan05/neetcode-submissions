class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;
        for(int i = 0; i < length ; i++) {
            System.out.print(nums[i]);
            for(int j = i + 1; j < length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}