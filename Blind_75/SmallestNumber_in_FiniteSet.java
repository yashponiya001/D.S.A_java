class SmallestInfiniteSet {
     int[] count;
     int popIndex = 1;
    public SmallestInfiniteSet() {
        count = new int[1002];
        Arrays.fill(count,1);
    }
    
    public int popSmallest() {
        
          count[popIndex] -= 1;
               
         int ans = popIndex;
          for(int i = popIndex + 1;i <= 1000;i++)
          {
              if(count[i] != 0)
              {
                popIndex = i;
                break;
              }
          }
        return ans;
    }
    
    public void addBack(int num) {
        
        if(count[num] != 0) return;
        count[num] += 1;

        if(num < popIndex) popIndex = num;
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
