//WAP to find the sum of frame element of a matrix

import java.util.Scanner;

public class sum_frame_element {
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

        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==0 ||j==0 ||j==col-1||i==row-1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
