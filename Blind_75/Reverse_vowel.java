//reverse vowles of a string
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i =0, j=arr.length-1;// here i is starting point and j is end point we are using two pointer approach to solve this problem
        String vowels ="aeiouAEIOU"; //list of vowels that will be checked

        while(i<j){
            while (i<j){
                char ch=arr[i];
                if(vowels.indexOf(ch)!=-1)
                break;
                i++;//it will check from the starting index and then keep on moving ahead 
            }
            while (i<j){
                char ch=arr[j];
                if(vowels.indexOf(ch)!=-1)// if ch is not a vowel then break and move to next value 
                break;
                j--; // it will check from end index for vowels then keep on decrementing index
        }
        if(i<j){
            char temp = arr[i];//create a temperoary variable to swap the values of i, j
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    return new String(arr); //convert the returned arr to string
}
}
