
//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        //transpose
        int N = matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0; j<matrix[0].length;j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[N-1-i][j];
                    matrix[N-1-i][j] = temp;
            }
        }
    }
}
