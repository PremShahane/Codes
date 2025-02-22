import java.util.*;
class diagonalsum{
    public static void main(String args[]){
        int[][] matrix = {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        int sum= 0, sum2=0;
        for(int i = 0; i<matrix.length ;i++){
            sum+= matrix[i][i];
            sum2+= matrix[i][matrix.length-i-1];
        }
        System.out.println(sum + " and " + sum2);
    }
}