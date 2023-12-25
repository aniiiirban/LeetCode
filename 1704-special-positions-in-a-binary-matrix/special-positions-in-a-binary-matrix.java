class Solution {
    public int numSpecial(int[][] mat) {
        int rowSum[]= new int[mat.length];
        int colSum[]= new int[mat[0].length];
        int c=0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0;j<mat[0].length; j++)
            {
                rowSum[i]+= mat[i][j];
                colSum[j]+= mat[i][j];
            }
        }
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0;j<mat[0].length; j++)
            {
                if(mat[i][j]==1 && rowSum[i]==1 && colSum[j]==1)
                c++;
            }
        } return c;
    }
}