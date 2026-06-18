class Solution {
    public int[] sortArray(int[] nums) {
    
            // insertion sort

            for(int a = 1; a < nums.length; a++){

                int b = a;

                while( b > 0 && nums[b-1] > nums[b]){
                    int temp = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = temp;
                    b--;
                }
            }

            return nums;

         
        
    }

}