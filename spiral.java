import java.util.*;
 

 class spiral {
    public static void main(String args[]){
        int matrix [][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};

        int startrow = 0 ;
        int endrow = matrix.length-1;
        int startcol = 0;
        int endcol = matrix[0].length-1;

        while(startrow <= endcol && startcol <= endcol){

            //top 
            for(int j = startcol ; j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" " );
            }

            // Right 
            for(int i = startrow+1 ; i<=endrow ; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            // Bottom
            for(int j = endcol-1  ; j>= startcol  ;j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
                
            }

            //left 
            for(int i = endrow-1;i>startrow;i-- ){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");   
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
 }