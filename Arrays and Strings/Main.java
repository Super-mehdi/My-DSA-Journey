public class Main {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        System.out.println(java.util.Arrays.deepToString(matrix));
        ZeroMatrix.zeroMatrix2(matrix);
        System.out.println(java.util.Arrays.deepToString(matrix));
    }
}
