class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        
    
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        
       
        for (int i = 2; i < nums.length; i++) {
            if (ls1.get(ls1.size() - 1) > ls2.get(ls2.size() - 1)) {
                ls1.add(nums[i]);
            } else {
                ls2.add(nums[i]);
            }
        }
        
       
        int idx = 0;
        for (int val : ls1) {
            nums[idx++] = val;
        }
        for (int val : ls2) {
            nums[idx++] = val;
        }
        
        return nums;
    }
}
