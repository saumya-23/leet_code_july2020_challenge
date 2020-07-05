class Solution {
    public int hammingDistance(int x, int y) {
        
        int result = 0;
        int z = x^y;
        String binaryNum = "";
        while(z>0){
            ++result;
            z &= z-1;
        }
        
        return result;
    }
}