class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0 ; 
        int right = numbers.length-1 ;

        for(int nums : numbers){
            int sum = numbers[left] + numbers[right] ;
            if(sum==target){
                return new int[] {++left , ++right} ;
            }
            if(sum<target) left++ ;
            if(sum>target) right-- ; 
        }
    return new int [] {} ;
        
    }
}