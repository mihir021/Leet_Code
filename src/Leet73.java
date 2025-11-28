class Solution73 {
    public void setZeroes(int[][] matrix) {
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    makeZero(i,j,matrix);
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j < matrix[0].length;j++){
                if(matrix[i][j] == Integer.MAX_VALUE -21){
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    void makeZero(int i,int j, int [][] matrix){
        int fix =0;
        int fix2 = 0;
        do{
            if(matrix[i][fix++] != 0){
                fix--;
                matrix[i][fix++] =Integer.MAX_VALUE -21;
            }
        }while ((fix < matrix[0].length));
        do{
            if(matrix[fix2++][j] != 0){
                fix2--;
                matrix[fix2++][j] =Integer.MAX_VALUE -21;
            }
        }while (fix2 < matrix.length);
    }
}