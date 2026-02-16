//WAP to find sum of diagonal of matrix

import java.util.Scanner;

public class sum_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        //for input and sum together
        int sum=0;
        System.out.println("Enter matrix element: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = sc.nextInt();
                if(i==j){
                    sum +=matrix[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal element is: " + sum);
    }
}
