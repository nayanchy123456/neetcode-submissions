class Solution {
    public int majorityElement(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int max =0;
            int result = 0;

            for(int i=0; i<nums.length; i++){

                if(map.containsKey(nums[i])){

                        map.put(nums[i], map.get(nums[i]) + 1);
                }
                else{
                        map.put(nums[i],0);
                }


                if(map.get(nums[i]) >= max){
                    result = nums[i];
                    max = map.get(nums[i]);
                }
            }

            return result;
    }


}