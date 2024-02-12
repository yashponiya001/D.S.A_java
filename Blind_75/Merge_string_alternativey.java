class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb =  new StringBuilder ();
        int n1= word1.length(); //here we will count the word lengths in both the words
        int n2= word2.length();
        int i =0;
        while(i<n1 || i<n2){ //this loop will run for both the words 1and 2
            if(i<n1)
                sb.append(word1.charAt(i));//here the word will be appended as per the i^th index at which the condition is true 
                  if(i<n2)
                sb.append(word2.charAt(i));//here the word will apend as the ith index just like above consequtively from word 1and 2
                i++;
        }
        return sb.toString(); //here we will print the final ans and then convert it to string as it is required in strings 
    }
}
