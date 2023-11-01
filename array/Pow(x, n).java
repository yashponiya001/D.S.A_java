class Solution {
    public double myPow(double x, int n) {
        double ans =1.0; //initialization
        long nn=n;  // to store the duplicate copy
        if(nn<0) nn =-1*nn; // if the given no is negative then we will make it positive by additng it to -1
        while (nn>0){
            if(nn%2 ==1){  //when the power is even
                ans =ans*x;
                nn =nn-1;
            }
            else{          //when power is odd
                x=x*x;
                nn =nn/2;
            }
        }
        if(n<0) ans = (1.0)/(ans); //check for the sign of the power if it is negative we will divide it by one
        return ans;
         }
}
