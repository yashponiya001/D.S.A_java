class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right= height.length-1;

        while(left < right){
            int currentArea =Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(maxArea, currentArea);

            if(height[left] <height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
//this is solved in 0(n)
//in this we are using two pointers from right and left which will we will iterate on the basis of small height if left is small it will increase and if right is small it will decrease and we will find the best case possible wile taking of the areas at the same time
