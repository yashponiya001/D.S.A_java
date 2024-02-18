class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> num_occurence = new HashMap();
        for(int num:arr){
            num_occurence.put(num, num_occurence.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> unique_vals = new HashSet(num_occurence.values());
        return num_occurence.size()  == unique_vals.size();
    }
    }

        /*int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int j : arr) {
            if (j < min) min = j;
            if (j > max) max = j;
        }
        int[] freq = new int[max - min + 1];
        int[] count = new int[n + 1];
        for (int j : arr) {
            freq[j - min]++;
        }
        for (int j : freq) {
            if (j != 0) count[j]++;
            if (count[j] >= 2) return false;
        }
        return true;
    }
}*/
