class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            
            // check if complement already exists
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff) + 1, i + 1}; // 1-based index
            }
            
            // store value with its index
            map.put(numbers[i], i);
        }
        
        return new int[0];
    }
}