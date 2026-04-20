import java.util.Set;
import java.util.HashSet;

public class ZeroMatrix{
    //If an element is 0, all of the elements on the same column and row should be put to 0.
    public static void zeroMatrix(int[][] matrix){
        int n=matrix.length,m=matrix[0].length;
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i=0;i<n;i++){
            if (rows.contains(i)) {
            for (int j=0;j<m;j++) matrix[i][j]=0;
            continue;
            } 
            for (int j=0;j<m;j++){
                if (cols.contains(j)) matrix[i][j]=0;
            }
        }
    }
}