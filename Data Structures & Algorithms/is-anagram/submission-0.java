class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer>  magicbox = new HashMap<Character,Integer>();
        if(s.length() != t.length()){
            return false;
        }
         for(int i = 0; i < s.length(); i++){
            magicbox.put(s.charAt(i),                    magicbox.getOrDefault(s.charAt(i), 0) + 1);
        } 
         for(int i = 0; i < t.length(); i++){
            int newCount = magicbox.getOrDefault(t.charAt(i),0)-1;
            magicbox.put(t.charAt(i),newCount);
             if(newCount < 0){
            return false;
        }
        } return true;
    }
}
