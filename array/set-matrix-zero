//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.



import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols= matrix[0].length;
        Set<Integer> rowsSet = new HashSet<>();
         Set<Integer> colsSet = new HashSet<>();
         for(int i=0;i<rows;i++){
             for(int j=0; j<cols;j++){
                 if(matrix[i][j]==0){
                     rowsSet.add(i);
                     colsSet.add(j);
                 }
             }
         }
         for(int i =0;i<rows;i++){
             for(int j =0; j<cols;j++){
                 if(rowsSet.contains(i)|| colsSet.contains(j)){
                 matrix[i][j] = 0;
             }
         }
         }
    }
}
