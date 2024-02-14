/*class Solution {
    public void moveZeroes(int[] nums) {
        int ball = 0; // this ball will keep the track of all zeroes and will collect all of them while iterating
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){// the the value 0 will be countered it will increase the ball count
                ball++;
            }
            else if (ball>0){
                int temp = nums[i];//swap the value with the current 0 value
                nums[i]=0;
                nums[i-ball] = temp;
            }
        }
    }
}*/

//solution 2
class Solution {
    public void moveZeroes(int[] arr) {
        if(arr.length<=1)
            return;
        
        int zero_cnt =0;
        int ind=0, right=arr.length-1, left=0;
        
        while(left<=right){
            if(arr[left]==0){
                left++;
                continue;
            }else{
                arr[ind]=arr[left];
                ind++;
                left++;
            }
        }
        
        if(ind<arr.length){
            while(ind<arr.length){
                arr[ind]=0;
                ind+=1;
            }
        }
        return;
    }
}
