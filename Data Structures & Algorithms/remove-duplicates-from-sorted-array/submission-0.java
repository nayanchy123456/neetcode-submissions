class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l = 1; 
        int r = 1;

        for( r = 1;  r<nums.length; r++){
            if(nums[r] != nums[r - 1]){
                nums[l++] = nums[r];
            }
        }
        
        return l;
    }


}