class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character ,Integer> anagram = new HashMap<>();

        for(char c : s.toCharArray()){
            anagram.put(c, anagram.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            anagram.put(c, anagram.getOrDefault(c, 0) - 1);
        }

        for(int count : anagram.values()){
            if(count != 0)  return false;
        }

        return true;
    }
}
