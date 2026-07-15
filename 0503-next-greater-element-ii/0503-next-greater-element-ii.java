class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            int element = nums[i];
            arr[i] = -1;
            for (int k = 1; k < n; k++) {
                int j = (i + k) % n;
                
                if (nums[j] > element) {
                    arr[i] = nums[j]; 
                    break; 
                }
            }
        }
        return arr;
    }
}


/// brute force approach he 
