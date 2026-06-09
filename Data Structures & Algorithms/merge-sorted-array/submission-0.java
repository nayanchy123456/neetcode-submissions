class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

            int n1 = ( m + n ) - 1;
            int n2 = n - 1;

            int i = n1;
            int j = n2;

            while(i >n1 - n || j >=0){

                if(nums1[i] == 0){
                    nums1[i] = nums2[j];
                    i--;
                    j--;
                }
            }

            Arrays.sort(nums1);
    }
}