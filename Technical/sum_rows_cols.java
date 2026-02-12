//Sum of rows and cols of matrix

public class sum_rows_cols {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            int rowSum = 0;   //inside the loop so that every time a new row comes in itertion the sum becomes 0
            int colSum = 0;
            for(int j=0; j<n; j++){
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            System.out.println(rowSum);
            System.out.println(colSum);
        }

        // or just make 2 loops and define differently
        //  for(int i=0;i<n;i++){   
        //     int rowSum = 0;
        //     for(int j=0; j<n; j++){
        //         rowSum += arr[i][j];
        //     }
        //     System.out.println(rowSum);
        // }

        // for(int i=0;i<n;i++){
        //     int colSum = 0;
        //     for(int j=0; j<n; j++){
        //         colSum += arr[j][i];
        //     }
        //     System.out.println(colSum);
        // }
    }
}
