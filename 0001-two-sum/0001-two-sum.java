class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> mp = new HashMap<>() ;
           int need = 0 ; 
        for(int i=0 ; i<nums.length ; i++){
           need = target - nums[i] ;
            if (mp.containsKey(need)){
                return new  int[] {mp.get(need) , i } ;
            }
            mp.put(nums[i] , i) ;
        }
        return new int[] {}  ;
    }
}