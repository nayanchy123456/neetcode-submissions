class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int a = 1;
        int b = 1;
        for(int i=0; i<numbers.length; i++){

            for(int j = 1; j  < numbers.length; j++){

                if(numbers[i] + numbers[j] == target){
                    a += i;
                    b += j;
 
                    return new int [] {a,b};
                }
            }

        }

        return new int [0];
    }
}   