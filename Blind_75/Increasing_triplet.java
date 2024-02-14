class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        
        for (int num : nums) {// if the element is equal or less than a then update a with the element
            if (num <= a) {
                a = num;
            } else if (num <= b) {//the the element is greater than a but is less than b then update b
                b = num;
            } else {
                return true;// if the element is greater then both a and b ,then an increasing triplet is fount and return true
            }
        }
        
        return false;// if there is no increasig triplet and the loop is finished then return false
    }
}
