class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int count = 0;
        for(int i =0;i<k;i++){
        count += nums[i];
         }
        int maxSum = count;
        
        for(int i=k;i<nums.length;i++){
            count += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, count);
        }
        return (double)maxSum/k;
    }
}
