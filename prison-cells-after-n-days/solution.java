class Solution {
    public int[] prisonAfterNDays(final int[] cells, int N) {
        final int first[] = new int[8];
        first[0] = 0;
        first[7] = 0;

        for (int j = 1; j < 7; j++) {
            if (cells[j - 1] == cells[j + 1])
                first[j] = 1;
            else
                first[j] = 0;
        }
        int count = 1;

        N -= 1;

        for (int i = 0; i < 8; i++)
            cells[i] = first[i];

        while (N-- > 0) {
            final int[] temp = new int[8];
            
            for(int j=1;j<7;j++)
            {
                if(cells[j-1] == cells[j+1])
                    temp[j] = 1;
                else
                    temp[j] = 0; 
            }
            
            if(Arrays.equals(temp,first))
                N=N%count;
            for(int j=0;j<8;j++)
            {
                cells[j] = temp[j];
            }
            count++;
        }
        
        return cells;
    }
}