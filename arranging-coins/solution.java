class Solution {
    public int arrangeCoins(int n) {
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        long sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = (long)sum+i;
            if(sum > (long)n)
                return i-1;
            else if(sum == n)
                return i;
        }
        return 0;
    }
}