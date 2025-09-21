class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0, maxCount = 0;

        // initial window
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
        }
        maxCount = count;

        // sliding window
        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i - k)) != -1) count--; // remove left char
            if (vowels.indexOf(s.charAt(i)) != -1) count++;     // add right char
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
