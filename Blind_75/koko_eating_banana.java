class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(blackbox(mid,piles,h)){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
    public boolean blackbox(int maxpiles,int[] piles,int h){
        int hours=0;
        for(int i:piles){
            int time=i/maxpiles;
            hours+=time;
            if(i%maxpiles!=0) hours++;
        }
        if(hours<=h)
            return true;
        return false;
    }
} 
//with comments
/*class Solution {
    // Method to find the minimum eating speed
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // The minimum possible eating speed
        int high = Integer.MIN_VALUE; // The maximum possible eating speed
        
        // Find the maximum pile size to set as the initial high value
        for(int i = 0; i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }
        
        // Binary search to find the minimum eating speed
        while(low < high){
            int mid = low + (high - low) / 2; // Midpoint of low and high
            // If it's possible to eat all bananas at this speed within h hours
            if(blackbox(mid, piles, h)){
                high = mid; // Try a lower speed
            }
            else {
                low = mid + 1; // Try a higher speed
            }
        }
        // The lowest possible eating speed that allows finishing within h hours
        return low;
    }
    
    // Helper method to check if it's possible to eat all bananas at a given speed within h hours
    public boolean blackbox(int maxpiles, int[] piles, int h){
        int hours = 0; // Total hours needed to eat all piles at the given speed
        for(int i : piles){
            int time = i / maxpiles; // Hours needed to eat the current pile
            hours += time;
            // If there are leftover bananas, add an extra hour
            if(i % maxpiles != 0) hours++;
        }
        // Return true if the total hours is less than or equal to h
        return hours <= h;
    }
}
*/
