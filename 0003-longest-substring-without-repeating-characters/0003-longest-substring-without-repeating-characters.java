class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
for (int i = 0; i < s.length(); i++) {


    char current = s.charAt(i);
   if(map.containsKey(current)){
    int oldPosition = map.get(current);
    left =  Math.max(left, map.get(current)+1);
   }
   map.put(current, i);


maxLen = Math.max(maxLen, i - left + 1);


}
return maxLen ;
        
    }
}