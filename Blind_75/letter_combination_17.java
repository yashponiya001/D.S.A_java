/*class Solution {
	public static String takeCombinations(int digit, String alfabet)
	{
		int index,n;
		StringBuilder rez = new StringBuilder();
		switch(digit){
			case 7 -> {
				index = 3 * (digit-2);
				n=4;
			}
			case 8 ->
			{
				index = 3 * (digit-2) + 1;
				n=3;
			}
			case 9 ->
			{
				index = 3 * (digit-2) + 1;
				n=4;
			}
			default ->
			{
				index = 3 * (digit-2);
				n=3;
			}
 		}
		for(int i=0;i<n;i++)
			rez.append(alfabet.charAt(index + i));

		return rez.toString();
	}

	public static List<String> letterCombinations(String digits) {
		int digit;
		char c = 'a';
		String alfabet = "abcdefghijklmnopqrstuvwxyz";
		List<String> thisCombinations = new ArrayList<>();
		List<String> allCombinations = new ArrayList<>();
		for (int i = 0; i < digits.length(); i++) {
			digit = digits.charAt(i) - '0';
			thisCombinations.add(takeCombinations(digit, alfabet));
		}
		int x = 0;
		StringBuilder rezString = new StringBuilder();
		if(thisCombinations.size()!=0) {
			for (int i = 0; i < thisCombinations.get(0).length(); i++) {
				rezString.append(thisCombinations.get(0).charAt(i));
				if (thisCombinations.size() == 1) {
					allCombinations.add(rezString.toString());
				} else {
					for (int j = 0; j < thisCombinations.get(1).length(); j++) {
						rezString.append(thisCombinations.get(1).charAt(j));
						if (thisCombinations.size() == 2) {
							allCombinations.add(rezString.toString());

						} else {
							for (int k = 0; k < thisCombinations.get(2).length(); k++) {
								rezString.append(thisCombinations.get(2).charAt(k));
								if (thisCombinations.size() == 3) {
									allCombinations.add(rezString.toString());
								} else {
									for (int l = 0; l < thisCombinations.get(3).length(); l++) {
										rezString.append(thisCombinations.get(3).charAt(l));
										allCombinations.add(rezString.toString());
										rezString.deleteCharAt(3);
									}
								}
								rezString.deleteCharAt(2);
							}
						}
						rezString.deleteCharAt(1);
					}
				}
				rezString.deleteCharAt(0);
			}
		}
		return allCombinations;
	}
}

public class Solution {

    public List<String> letterCombinations(String digits) {
        ArrayList<String> s = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        s.add("");
        s.add("");

        if (digits.length() == 0) {
            return res;
        }

        String ss = "";
        int cc = 0;
        int jj = 97;

        for (int i = 1; i < 6; i++) {
            cc = 0;
            ss = "";
            for (; jj <= 122; jj++) {
                if (cc > 2) {
                    break;
                }
                cc++;
                ss += (char) (jj);
            }
            s.add(i, ss);
        }

        s.add(6, "pqrs");
        s.add(7, "tuv");
        s.add(8, "wxyz");
        res.add("");

        for (int i = 0; i < digits.length(); i++) {
            char d = digits.charAt(i);
            int x = Character.getNumericValue(d);

            ArrayList<String> temp = new ArrayList<>();
            for (int j = 0; j < s.get(x - 1).length(); j++) {
                char c = s.get(x - 1).charAt(j);

                for (int k = 0; k < res.size(); k++) {
                    temp.add(res.get(k) + c);
                }
            }

            res = temp;
        }

        return res;
   
    }
}*/
class Solution {
    static HashMap<Character, String[]> letters = new HashMap<Character, String[]>();

    public List<String> letterCombinations(String digits) {
        letters.put('2', new String[] { "a", "b", "c" });
        letters.put('3', new String[] { "d", "e", "f" });
        letters.put('4', new String[] { "g", "h", "i" });
        letters.put('5', new String[] { "j", "k", "l" });
        letters.put('6', new String[] { "m", "n", "o" });
        letters.put('7', new String[] { "p", "q", "r", "s" });
        letters.put('8', new String[] { "t", "u", "v" });
        letters.put('9', new String[] { "w", "x", "y", "z" });

        List<String> results = new ArrayList<String>();
        if(digits.length() <= 0) return results;
        addLetter(digits, 0, "", results);
        return results;
    }

    public void addLetter(String digits, int index, String s, List<String> results) {
        if (index >= digits.length()) {
            results.add(s);
            return;
        }
        // System.out.println(index + ": " + s);
        String[] c = letters.get(digits.charAt(index));
        for (int i = 0; i < c.length; i++) {
            addLetter(digits, index+1, s.concat(c[i]), results);
        }
    }
}
