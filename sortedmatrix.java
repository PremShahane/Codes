import java.util.*;

class sortedmatrix{
    public static void main(String args[]){
        int[][] matrix ={{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};

        int n =50;
        for(int i=0;i<=matrix.length-1;i++){
        for(int j=0;j<=matrix[0].length-1;j++){
            if(matrix[i][j]==n){
                System.out.println("Element found at index " + "[" + i + "]" + "[" + j + "]");
            }
        }
            
        }
    }
}