class Solution {
    public int findDuplicate(int[] nums) {
        int slow= nums[0];  //here we are using linked list cycle method to solve this given problem and a two pointer approact where there is fast pointer and a slow pointer here the fast pointer moves two step at a time and the slow pointer moved one step at a time and where in a linked list cycle where both the pointers will colide will be the point where the duplicate number will be present
      
        int fast =nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow !=fast);
    fast = nums[0];
        while(slow !=fast){
            slow=nums[slow];
            fast = nums[fast];

        }
    return slow;
        }
}
