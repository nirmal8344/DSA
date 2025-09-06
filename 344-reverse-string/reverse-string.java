class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1; //chat left=0 nu poten,wrong
        while(left<right)
        {
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp; //nan pana thapu s[temp] its wrong!
        left++;
        right--;
        } 

        
    }
}