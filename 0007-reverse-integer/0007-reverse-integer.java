class Solution {
    public int reverse(int x) {
        long rev = 0;
        int temp = x;
        while(temp!=0){
          int n = temp%10  ;
          rev = (rev*10) + n ;
          temp =temp / 10;
           
         
        }
         if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
            return 0 ;
          }
      
        return (int) rev ;
    }
}