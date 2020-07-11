class Solution {
    public int[] plusOne(int[] digits) {
        
        int i;
        for(i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                //carry+=digits[i];
                digits[i]=digits[i] + 1;
                break;
            }
        }
        if(i<0){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
        }else
            return digits;
    }
}