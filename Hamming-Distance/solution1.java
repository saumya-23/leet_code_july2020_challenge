class Solution {
    public int hammingDistance(int x, int y) {
        
        String binary_x = convertBinary(x);
        String binary_y = convertBinary(y);
        int len_diff = 0;
        int result = 0;
        int x_len = binary_x.length();
        int y_len = binary_y.length();
        
        if(x_len != y_len)
        {
            len_diff = (x_len < y_len) ? (y_len - x_len) : (x_len - y_len);
            
            if(x_len < y_len){
                for(int i=0;i<len_diff;i++)
                    binary_x = binary_x+"0";
            }
            else{
                for(int i=0;i<len_diff;i++)
                    binary_y = binary_y+"0";
            }
        }
        
        for(int i=0;i<binary_x.length();i++)
        {
            if(binary_x.charAt(i) != binary_y.charAt(i))
                result++;
        }
        return result;
    }
    
    public String convertBinary(int dec_num){
        String binaryNum = "";
        while (dec_num > 0)  
        { 
            // storing remainder in binary array 
            String num = Integer.toString(dec_num % 2);
            binaryNum = binaryNum + num;
            dec_num = dec_num / 2; 
        }
        return binaryNum;
    }
}



// EXPLANATION
/*

Convert both numbers in binary.
Check if there length are same.
If same, 
        Simply apply a for loop and increment the counter if bits are not same.
else,
    Count the diff between length, and add respective 0 to lesser number.
    Then check for each bit.
*/