class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0,right=s.length()-1; //idhula () poda marandhuten
        while(left<right)
        {
        while(left<right && !isVowel(arr[left])) left++;
        while(left<right && !isVowel(arr[right])) right--;
        if(left<right)
        {
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
        }
        return new String(arr);
    }

        private boolean isVowel(char c)// char c yen podanum nu yosichen.caz,
        {
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        //idhula return ku apro ena podanum nu nianichen.
        }
        
    }
