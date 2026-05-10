import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        int[][] A = new int[size][size];
        int[][] B = new int[size][size];
        int[][] C = new int[size][size];

        //input for matrix A
        System.out.println("Enter element for matrixx A");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                A[i][j] = sc.nextInt();
            }
        }

        //input for matrix B
        System.out.println("Enter element for matrixx B");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                B[i][j] = sc.nextInt();
            }
        }

        //Multiplied value will be stored in Matrix C
        System.out.println("Matrix C:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                C[i][j] = 0;
                for(int k=0;k<size;k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        //result
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
