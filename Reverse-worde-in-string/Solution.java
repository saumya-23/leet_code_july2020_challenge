class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        List<String> res = Arrays.asList(s.split("\\s+")); 
        Collections.reverse(res);
        
        return String.join(" ",res);
    }
}