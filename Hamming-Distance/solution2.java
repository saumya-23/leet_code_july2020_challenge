class Solution {
    public int hammingDistance(int x, int y) {
        
        int result = 0;
        int z = x^y;
        while(z>0){
            ++result;
            z &= z-1;
        }
        
        return result;
    }
}


// Explation
/*
QUESTION
The Hamming distance between two integers is the number of positions at which the corresponding bits
are different.
Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

ANSWER

Perform XOR operation of numbers and store it in new variable.
Beacuse XOR operation will result in 1 when there are different bit in two numbers.
Then simply count number of 1's in that new variable.
*/