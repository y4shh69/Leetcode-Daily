class Solution {
    public boolean isPalindrome(int x) {
        int revnum = 0 ;
        int y = x ;
        while(x>0){
            int lastdigit = x %10 ;
            revnum = (revnum *10) + lastdigit ;
            x /=10 ;
        }
        return revnum==y ;
        
    }
}