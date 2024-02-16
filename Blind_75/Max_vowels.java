class Solution {
    public int maxVowels(String s, int k) {
           int a = 0 , j = k;
        int ct = 0;
        //check for vowels in first k elements
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                ct++;
            }
        }
        int maxi = ct;
        //if ct is equal to k , there couldn't be greater answer than that so return 
        if(ct==k) return ct;
        //now keep moving the window of size k by increamenting j and a as a++ and j++
        while(j<s.length()){
            
            //if previous first element is vowel then decrease it's count
            if(s.charAt(a)=='a' || s.charAt(a)=='e' || s.charAt(a)=='i' || s.charAt(a)=='o' || s.charAt(a)=='u'){
                ct--;
            }
            a++;
            //if upcoming element is vowel then increase the count here the value of strings is checked
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                
               ct++;
            }
            j++;
            //store the maximum count till now
            maxi = Math.max(maxi,ct);
            
        }
        return maxi;
    }
}
