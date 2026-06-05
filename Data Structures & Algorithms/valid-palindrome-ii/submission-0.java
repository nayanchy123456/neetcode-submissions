class Solution {
    public boolean validPalindrome(String s) {
        
        // Iterating over string to remove one character and check palindrome

        for(int i=0; i<s.length(); i++){
           String newStr = s.substring(0, i) + s.substring(i + 1);
            
            if(isPalindrome(newStr)){
                return true;
            }
        }

        return false;
    }


    // making the method to find the palindrome

    public boolean isPalindrome(String s){
        int left = 0;
        int right  = s.length() -1; 
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left ++;
            right --;
        }

        return true;
    }   
}