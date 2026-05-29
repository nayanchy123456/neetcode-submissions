class Solution {
    public static int removeElement(int[] nums, int val) {

            ArrayList<Integer> list = new ArrayList<>();
            int count = 0; 
            

            for(int i=0; i<nums.length; i++){
                if (nums[i] != val) {
                       list.add(nums[i]);
                }
            }

            // copying the array list to nums again
            for(int i=0; i<list.size(); i++){
                    nums[i] = list.get(i);
            }

            return list.size();

     }

    
}