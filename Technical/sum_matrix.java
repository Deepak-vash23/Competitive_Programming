import java.util.Scanner;

public class sum_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //wap to find addition of 2 matrices
        int[][] matrix_1 = new int[3][3];
        for (int i=0;i<matrix_1.length;i++){
            for(int j=0;j<matrix_1.length;j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }

        //wap to find addition of 2 matrices
        int[][] matrix_2 = new int[3][3];
        for (int i=0;i<matrix_2.length;i++){
            for(int j=0;j<matrix_2.length;j++){
                matrix_2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        for (int i=0;i<matrix_1.length;i++){
            for(int j=0;j<matrix_1.length;j++){
                System.out.print(matrix_1[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Matrix 2:");
        for (int a=0;a<matrix_2.length;a++){
            for(int b=0;b<matrix_2.length;b++){
                System.out.print(matrix_2[a][b] + " ");
            }
            System.out.println(" ");
        }

        //Sum
        int[][] sum_matrix= new int[3][3];
        for (int a=0;a<sum_matrix.length;a++){
            for(int b=0;b<sum_matrix.length;b++){
                sum_matrix[a][b] =matrix_1[a][b] + matrix_2[a][b];
            }
        }

        System.out.println("Sum of matrix is: ");
        for (int a=0;a<matrix_2.length;a++){
            for(int b=0;b<matrix_2.length;b++){
                System.out.print(sum_matrix[a][b] + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
