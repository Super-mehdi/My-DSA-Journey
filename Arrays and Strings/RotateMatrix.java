public class RotateMatrix {
    public static int[][] rotateMatrix1(int[][] mat){
        int n=mat.length;
        int[][] rotatedMatrix= new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                rotatedMatrix[n-1-j][i]=mat[i][j];
            }
        }
        return rotatedMatrix;
    }
    public static void rotateMatrix2(int[][] mat){
        int n=mat.length;
        int tmp;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                tmp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tmp;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                tmp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=tmp;
            }
        }
    }
}