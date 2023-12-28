class Solution {
    public void rotate(int[][] matrix) {
        int temp=0; int n=matrix.length;


        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i+1; j<matrix[0].length; j++)
            {
                temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }
          for(int row = 0; row < matrix.length; row++) {
            int i = 0;
            int j = matrix[row].length - 1;
            while(i < j) {
                int tmp = matrix[row][i];
                matrix[row][i++] = matrix[row][j];
                matrix[row][j--] = tmp;
            }
        }
    }
}