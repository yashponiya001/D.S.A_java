class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int [26];
      
          for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }
        for(int i =0;i<26;i++){
            if((freq1[i]==0 && freq2[i] !=0) || (freq1[i] != 0 && freq2[i] ==0)){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0;i <26;i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}
/**Frequency Counting:

Two vectors (freq1 and freq2) are used to count the frequency of each letter in word1 and word2.
freq1[i] stores the count of the i-th letter in the English alphabet in word1, and similarly for freq2.
Checking Presence of Characters:

Iterate over each character in the alphabet.
If a character is present in one word and not in the other (or vice versa), return false.
This ensures that both words contain the same set of characters.
Sorting Frequencies:

Sort the frequency vectors (freq1 and freq2).
This step is necessary because the order of frequencies doesn't matter, only their values.
Comparing Sorted Frequencies:

Iterate through the sorted frequency vectors and compare corresponding elements.
If any corresponding elements are not equal, return false.
Final Result:

If all the checks pass, return true, indicating that the two words are "close" as per the problem definition. */
