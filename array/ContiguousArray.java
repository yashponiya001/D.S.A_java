class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int subArrayLength = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                subArrayLength = i + 1;
            } else if (mp.containsKey(sum)) {
                subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return subArrayLength;
    }
}


/* with comments 


class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length; // Length of the input array
        Map<Integer, Integer> mp = new HashMap<>(); // HashMap to store cumulative sum and index
        int sum = 0; // Cumulative sum of the elements
        int subArrayLength = 0; // Length of the longest subarray
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Update the cumulative sum, counting 0s as -1 and 1s as +1
            sum += nums[i] == 0 ? -1 : 1;
            
            // If the cumulative sum is 0, update the subarray length to i + 1
            if (sum == 0) {
                subArrayLength = i + 1;
            } 
            // If the cumulative sum has been seen before, update the subarray length to the maximum
            else if (mp.containsKey(sum)) {
                subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
            } 
            // If the cumulative sum has not been seen before, add it to the HashMap
            else {
                mp.put(sum, i);
            }
        }
        // Return the length of the longest subarray
        return subArrayLength;
    }
}
*/
