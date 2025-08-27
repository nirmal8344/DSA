class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,end=nums.length-1;

        while(mid<=end)
        {
        if(nums[mid]==0)
        {
        int temp=nums[low];
        nums[low]=nums[mid];
        nums[mid]=temp;
        low++;
        mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            int temp=nums[mid];
            nums[mid]=nums[end];
            nums[end]=temp;
            end--;
        }
    }
        
    }
}