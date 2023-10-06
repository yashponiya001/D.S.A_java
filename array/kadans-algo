/*Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.*/

import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
    if(nums.length==0)//when there is a nul array
    return 0;

           int max=nums[0];
           int sum = Math.max(0, max);// initially the sum will be 0 we will replace wuth the sum value which will be bigger
           for(int i=1;i<nums.length;i++){
               sum+= nums[i];// here we will increment the vsalue of sum if it is increasing
               max= Math.max(sum, max);//we will increment the max value
               if(sum<0) sum=0;// if the sum is less than 0 the sum will be 0 or unchanged if it is more than 0
            }
               return max;
    }
}
