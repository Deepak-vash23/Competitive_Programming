//Rotate a sq matrix by 90* clock wise (bottom right as a corner)
// Approach:
// Step1: Transpose matrix.
// Step2: Reverse element of every row.

import java.util.Scanner;

public class rotate_matrix {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int[][] matrix= new int[row][col];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //Step1: Transpose
        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print("Tranpose of matrix: " +matrix[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
