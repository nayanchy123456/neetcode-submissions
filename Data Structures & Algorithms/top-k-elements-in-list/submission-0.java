class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // 1  create hashmap

        HashMap<Integer, Integer> map = new HashMap<>();

        // 2 add all the elements in hashmap 

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 3 Convert the Map into the List of pairs so that i can sort the frequency with elements

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // 4 sort the frequency of elements in any order

        // sorting in descending order 
        Collections.sort(list , (a,b) -> b.getValue() - a.getValue());


        // 5 gettingn the top k elements
        int result [] = new int[k];

        for(int i = 0; i< k; i++){
            result[i] = list.get(i).getKey();
        }
            
        return result;
    }   

}