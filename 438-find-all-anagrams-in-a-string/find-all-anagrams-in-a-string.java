class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length())
        {
        return res;
        }
        int[] count1=new int[26];
        int[] count2=new int[26];

        for(char c:p.toCharArray())
        {
        count1[c-'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
        count2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1,count2))
        {
        res.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
        count2[s.charAt(i)-'a']++;
        count2[s.charAt(i-p.length())-'a']--;
        if(Arrays.equals(count1,count2))
        {
        res.add(i-p.length()+1);
        }
        }
        return res;
        
    }
}