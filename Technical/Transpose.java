//wap to create a matrix of order 3x3 and display it
//wap to print transpose of a matrix
//wap to find addition of 2 matrices
//wap to print sum of diagonal elements of a matrix

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //wap to create a matrix of order 3x3 and display it
        int[][] matrix_1 = new int[3][3];
        for (int i=0;i<matrix_1.length;i++){
            for(int j=0;j<matrix_1.length;j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i=0;i<matrix_1.length;i++){
            for(int j=0;j<matrix_1.length;j++){
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println(" ");
        }

        //wap to print transpose of a matrix
        for (int i=0;i<matrix_1.length;i++){
            for(int j=0;j<matrix_1.length;j++){
                System.out.print(matrix_1[j][i] + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}
