class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 1;
        // two pointer approach, checking the predecessor
        for(int j = 1 ; j < nums.length; j++){

                if(nums[j] != nums[ j-1]){
                   nums[i++] = nums[j];
                }
            }

            return i;
    }


}