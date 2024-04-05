class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int no_rob = 0;
        for(int i=0;i<nums.length;i++){
            int new_rob = no_rob + nums[i];
            int new_no_rob = Math.max(no_rob, rob);
            rob = new_rob;
            no_rob = new_no_rob;
        }
        return Math.max(rob, no_rob);
    }
}
