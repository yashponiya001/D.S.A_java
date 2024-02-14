class Solution {
    public boolean isSubsequence(String s, String t) {
      if(s.length() ==0) return true;

      int s_pointer = 0;
      int t_pointer = 0;

      while(t_pointer < t.length()){
          if(t.charAt(t_pointer) == s.charAt(s_pointer)){//if we find a match we will increment the value
             s_pointer++;

              if(s_pointer == s.length()) return true;// if f pointer is equal to s.length means we have found all the value in s string so return true
          }
          t_pointer++;
      }
      return false;
    }
}// time complexity is linear and space complexity is constant as we are only iterating this
