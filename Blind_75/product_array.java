class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] output_arr = new int[n];
        output_arr[0] = 1;//it will hold all the left product value

        for(int i =1; i<n; i++){
            output_arr[i] = nums[i-1] * output_arr[i-1];//this deals with the the left values array
        }
        int r=1;//it will hold the value from the other product from right current value
        for(int i=n-1; i>=0;i--){
            output_arr[i] = output_arr[i] * r;//here the output array of i is multiplied with the output array of r
            r=r*nums[i];// all the products of y from the output array
        }
        return output_arr;
    }
}
