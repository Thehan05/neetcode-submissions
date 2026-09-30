class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> elem = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            elem.add(nums[i]);
        }

        for(Integer x : elem) {
            if (!elem.contains(x - 1)) {
                int current = x;
                int length = 1;
                while(elem.contains(current + 1)) {
                    current++;
                    length++;
                }
                count = Math.max(count, length);   
            }
        }
        return count;
    }
}
