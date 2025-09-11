class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int sum=0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(int i=0;i<k;i++)
        {
        if(vowels.contains(s.charAt(i)))
        sum++;
        }
        max=Math.max(max,sum);
        for(int i=k;i<s.length();i++)
        {
        if(vowels.contains(s.charAt(i-k)))
        sum--;
        if(vowels.contains(s.charAt(i)))
        sum++;
        max=Math.max(max,sum);
        }
        return max;
}
}