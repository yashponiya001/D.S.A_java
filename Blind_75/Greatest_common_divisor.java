class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            return gcdOfStrings(str2,str1);// here we will swap the two strings
        }
        if(str2.equals(str1)){ // if both the strings are equal retuen the string
            return str1;
        }
        if(str1.startsWith(str2)){  // if string one starts with string 2 return the substring string 2 from string 1
            return gcdOfStrings(str1.substring(str2.length()),str2);

        }
        return ""; //if there is no common divisor return empty
    }
}
