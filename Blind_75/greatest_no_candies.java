//kid with the greatest numbers of candies 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i : candies){ //if current candie is more than max then update max
            if(i>max){
                max = i;
            }
        }
        List<Boolean> res = new ArrayList(); //create a list to store the value
        for(int i : candies){
            if(i+ extraCandies >= max){ //here we ARE adding extracandies to the value of current candies
                res.add(true); //when the kid is having max candies including extra candies at that time 
            }else {
                res.add(false); //when the kid dont have max candies even with having extra candies
            }
        }
        return res; // print the list that we have created time complexity is O(n)
    }
}
