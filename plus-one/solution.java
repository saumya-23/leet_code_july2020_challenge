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


//EXPLANATION

/* QUESTION
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, 
and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
*/

/* SOLUTION

3 cases :

1) IF last digit has number less than 9.
    Simply increment the value of last digit and return the array.

2) IF last digit is 9 :
    2)a) When length of number remains same(eg: 12789, after plus one -> 12790)
            Check if digit[i] is equal to 9, update the value to 0.
            Else, increment the value of last digit and return the array.

    2)b) When there is need to increase the length(eg: 9999. after plus one -> 10000)
            Follow the same procedure plus check if value of iterator is less than 0.
            If yes, Create a new array with length +1.
            Put the value of array[0] as 1 and rest as 0. 
*/