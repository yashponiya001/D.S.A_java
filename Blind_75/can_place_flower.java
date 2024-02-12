class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] ==0){
                int prev = (i==0 || flowerbed[i-1] ==0) ? 0:1;  //to find previous value
                int next =(i == flowerbed.length-1 || flowerbed[i+1] == 0)?0:1;//find next value if both value is 0 then we will plant 
                
                if(prev == 0 && next ==0){
                    flowerbed[i]=1;
                    count ++;
                }
            } 
            if (count>=n){
                return true;
            }
        }
        return false;

    }
}
