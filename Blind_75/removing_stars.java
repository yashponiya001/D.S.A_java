/*class Solution {
    public String removeStars(String s) {
        String str ="";
        for(int i = 0; i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!='*')
        {           str += String.valueOf(ch);

        }
            else{
                str = str.substring(0, str.length()-1);
            }
        }
        return str;
    }
}*/

class Solution {
    public String removeStars(String s) {
        int len = s.length();
        byte[] result = new byte[len];
        s.getBytes(0, len, result, 0);
        int stars = 0;
        for (int i = 0; i < len; i++) {
            if (result[i] == '*') {
                stars++;
            } else {
                result[i - stars * 2] = result[i];
            }
        }
        return new String(result, 0, len - stars * 2);
    }
}
