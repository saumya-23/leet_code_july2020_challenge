class Solution {
    public int hammingDistance(int x, int y) {
        
        int result = 0;
        int z = x^y;
        String binaryNum = "";
        while (z > 0)  
        { 
            // storing remainder in binary array 
            String num = Integer.toString(z % 2);
            binaryNum = binaryNum + num;
            z = z / 2; 
        }
        for(int i=0;i<binaryNum.length();i++)
        {
            if(binaryNum.charAt(i) == '1')
                result++;
        }
        
        return result;
    }
}